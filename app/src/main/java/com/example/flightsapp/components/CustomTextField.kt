package com.example.flightsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    icon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
) {
    Column (modifier = modifier) {
        BasicText(
            text = label,
            modifier = Modifier.padding(bottom = 8.dp),
            style = TextStyle (
                color = Color(0xFF454652),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )

        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(Color(0xFFF3F4F6))
                .height(60.dp),
            textStyle = TextStyle(
                color = Color.Black,
                fontSize = 16.sp
            ),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            decorationBox = { innerTextField ->
                Row (
                    modifier = Modifier
                        .padding(horizontal = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        if (value.isEmpty()) {
                            BasicText (
                                text = placeholder,
                                style = TextStyle (
                                    color = Color(0xFF9CA3AF),
                                    fontSize = 16.sp
                                )
                            )
                        }
                        innerTextField()
                    }
                    if (icon != null) {
                        Spacer(modifier = Modifier.width(8.dp))
                        icon()
                    }
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    var email by remember { mutableStateOf("") }

    CustomTextField(
        value = email,
        onValueChange = { email = it },
        label = "Correo",
        placeholder = "ejemplo@correo.com",
        icon = {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(Color.Black)
            )
        }
    )
}
