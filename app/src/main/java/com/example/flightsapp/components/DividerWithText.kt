package com.example.flightsapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightsapp.R

@Composable
fun DividerWithText(text: String, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(
            modifier = Modifier.weight(1f),
            thickness = 1.dp,
            color = Color(0xFFD1D5DB)
        )
        BasicText (
            text = text,
            modifier = Modifier.padding(horizontal = 16.dp),
            style = TextStyle (
                color = Color(0xFF454652),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        )
        HorizontalDivider(
            modifier = Modifier.weight(1f),
            thickness = 1.dp,
            color = Color(0xFFD1D5DB)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DividerWithTextPreview(){
    DividerWithText(stringResource(R.string.continue_with))
}