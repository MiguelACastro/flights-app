package com.example.flightsapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightsapp.R
import com.example.flightsapp.components.CustomButton
import com.example.flightsapp.components.CustomTextField
import com.example.flightsapp.components.DividerWithText
import com.example.flightsapp.components.Logo

@Composable
fun Login() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0x0D003366),
                        Color(0xFFF8F9FA)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Logo(
                modifier = Modifier.padding(top = 60.dp, bottom = 40.dp)
            )
            
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .padding(24.dp)
            ) {
                Column {
                    CustomTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = stringResource(R.string.email_label),
                        placeholder = stringResource(R.string.email_placeholder),
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.email),
                                contentDescription = null,
                                tint = Color(0xFFC0C4CC),
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    CustomTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = stringResource(R.string.password_label),
                        placeholder = stringResource(R.string.password_placeholder),
                        visualTransformation = PasswordVisualTransformation(),
                        icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.eye_outline),
                                contentDescription = null,
                                tint = Color(0xFFC0C4CC),
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        modifier = Modifier.fillMaxWidth()
                    )
                    
                    BasicText(
                        text = stringResource(R.string.forgot_password),
                        modifier = Modifier
                            .padding(vertical = 12.dp)
                            .clickable { },
                        style = TextStyle(
                            color = Color(0xFF005A6F),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )

                    CustomButton(
                        text = stringResource(R.string.login_button_text),
                        onClick = { },
                        backgroundColor = Color(0xFF003366),
                        modifier = Modifier.fillMaxWidth()
                    )

                    DividerWithText(
                        text = stringResource(R.string.continue_with),
                        modifier = Modifier.padding(vertical = 24.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CustomButton(
                            text = stringResource(R.string.login_google),
                            onClick = { },
                            backgroundColor = Color(0xFFF3F4F6),
                            contentColor = Color.Black,
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.google),
                                    contentDescription = null,
                                    tint = Color.Unspecified,
                                    modifier = Modifier.size(20.dp)
                                )
                            },
                            modifier = Modifier.weight(1f)
                        )
                        CustomButton(
                            text = stringResource(R.string.login_apple),
                            onClick = { },
                            backgroundColor = Color(0xFFF3F4F6),
                            contentColor = Color.Black,
                            icon = {
                                Icon(
                                    painter = painterResource(id = R.drawable.apple),
                                    contentDescription = null,
                                    tint = Color.Black,
                                    modifier = Modifier.size(20.dp)
                                )
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            BasicText(
                text = buildAnnotatedString {
                    append(stringResource(R.string.no_account))
                    withStyle(style = SpanStyle(color = Color(0xFF003366), fontWeight = FontWeight.Bold)) {
                        append(stringResource(R.string.login_register))
                    }
                },
                modifier = Modifier
                    .padding(bottom = 80.dp)
                    .clickable { },
                style = TextStyle(
                    color = Color(0xFF454652),
                    fontSize = 15.sp
                )
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                BasicText(
                    text = stringResource(R.string.terms_of_service),
                    style = TextStyle(color = Color.Gray, fontSize = 12.sp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .clickable { }
                )
                BasicText(
                    text = stringResource(R.string.privacy_policy),
                    style = TextStyle(color = Color.Gray, fontSize = 12.sp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .clickable { }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}
