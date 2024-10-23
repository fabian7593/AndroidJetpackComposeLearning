package com.arcandecoder.calculatetip

import android.icu.text.NumberFormat
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.captionBarPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Percent
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcandecoder.calculatetip.ui.theme.CalculateTipTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculateTipTheme {
                Surface(){
                    TipTimeLayout(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

private fun calculateTip(amount: Double,
                         tipPercent:Double = 15.0,
                         roundUp:Boolean
                         ):String{
    var tip = tipPercent / 100 * amount
    if(roundUp){
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

@Composable
fun TipTimeLayout(modifier : Modifier = Modifier) {

    var roundUp by remember { mutableStateOf(false) }

    val amountInput = remember { mutableStateOf("") }
    val amount = amountInput.value.toDoubleOrNull() ?: 0.0

    val tipInput = remember { mutableStateOf("") }
    val tipPercent = tipInput.value.toDoubleOrNull() ?: 0.0
    
    val tip = calculateTip(amount, tipPercent, roundUp)

   Column(modifier = modifier
       .statusBarsPadding()
       .captionBarPadding()
       .padding(horizontal = 40.dp)
       .safeDrawingPadding()
       .verticalScroll(rememberScrollState()),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center)
   {
       Text(
           text= stringResource(R.string.calculte_tip),
           modifier = Modifier
               .padding(bottom = 16.dp, top = 40.dp)
               .align(alignment = Alignment.Start)
       )

       EditNumberFields(
                        value = amountInput.value,
                        label = R.string.calculate_input,
                        leadingIcon = Icons.Filled.AttachMoney,
                        onValueChange = {  amountInput.value = it },
                        imeAction = ImeAction.Next,
                        modifier =  Modifier.padding(bottom = 16.dp))

       EditNumberFields(
                        value = tipInput.value,
                        label = R.string.round_up_tip,
                        leadingIcon = Icons.Filled.Percent,
                        onValueChange = {  tipInput.value = it },
                        modifier =  Modifier.padding(bottom = 16.dp))

       RoundTheTipRow(
                        roundUp = roundUp,
                        onRoundUpChanged = { roundUp = it },
                        modifier = Modifier)

       Text(
            text= stringResource(R.string.tip_amount, tip),
            style = MaterialTheme.typography.displaySmall
       )
       Spacer(modifier = Modifier.height(150.dp))
   }
}

@Composable
fun EditNumberFields(
    value:String,
    @StringRes label: Int,
    leadingIcon: ImageVector,
    onValueChange: (String) ->Unit,
    modifier: Modifier = Modifier,
    imeAction: ImeAction = ImeAction.Done
    ){

    OutlinedTextField(
        value = value,
        leadingIcon = { Icon(leadingIcon, contentDescription = null) },
        onValueChange = onValueChange,
        label = { Text(text = stringResource(label)) },
        modifier = modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Number,
            imeAction = imeAction
        ),
        singleLine = true
    )
}

@Composable
fun RoundTheTipRow(
    roundUp: Boolean,
    onRoundUpChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier){
    Row(modifier = modifier
        .fillMaxWidth()
        .size(48.dp),
        verticalAlignment = Alignment.CenterVertically){
        Text(text = stringResource(R.string.round_up_tip))

        Switch( modifier =  modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.End),
            checked = roundUp,
            onCheckedChange = onRoundUpChanged)
    }
}

@Preview(showBackground = true)
@Composable
fun TipTimeLayoutPreview() {
    CalculateTipTheme {
        TipTimeLayout(modifier = Modifier.fillMaxSize())
    }
}