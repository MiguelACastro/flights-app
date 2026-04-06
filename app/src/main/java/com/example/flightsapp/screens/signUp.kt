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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightsapp.R
import com.example.flightsapp.components.CustomButton
import com.example.flightsapp.components.CustomTextField
import com.example.flightsapp.components.DividerWithText

@Composable
fun SignUp() {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var repeatPassword by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
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
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.Black
                    )
                }
                BasicText(
                    text = stringResource(id = R.string.logo_text),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 2.sp,
                        color = Color.Black
                    )
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 20.dp),
                horizontalAlignment = Alignment.Start
            ) {
                BasicText(
                    text = stringResource(id = R.string.create_account_title),
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
                BasicText(
                    text = stringResource(id = R.string.create_account_subtitle),
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.Gray
                    ),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .padding(24.dp)
            ) {
                Column {
                    CustomTextField(
                        value = fullName,
                        onValueChange = { fullName = it },
                        label = stringResource(id = R.string.full_name_label),
                        placeholder = stringResource(id = R.string.full_name_placeholder),
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = Color(0xFFC0C4CC),
                                modifier = Modifier.size(24.dp)
                            )
                        },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    CustomTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = stringResource(id = R.string.email_label),
                        placeholder = stringResource(id = R.string.email_placeholder),
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
                        label = stringResource(id = R.string.password_label),
                        placeholder = stringResource(id = R.string.password_placeholder),
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

                    Spacer(modifier = Modifier.height(16.dp))

                    CustomTextField(
                        value = repeatPassword,
                        onValueChange = { repeatPassword = it },
                        label = stringResource(id = R.string.repeat_password_label),
                        placeholder = stringResource(id = R.string.repeat_password_placeholder),
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

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox (
                            checked = checked,
                            onCheckedChange = { checked = it },
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        BasicText(
                            text = buildAnnotatedString {
                                append(stringResource(id = R.string.accept_terms))
                                withStyle(style = SpanStyle(color = Color(0xFF005A6F), textDecoration = TextDecoration.Underline)) {
                                    append(stringResource(id = R.string.terms_of_service))
                                }
                                append(stringResource(id = R.string.accept_terms_and))
                                withStyle(style = SpanStyle(color = Color(0xFF005A6F), textDecoration = TextDecoration.Underline)) {
                                    append(stringResource(id = R.string.privacy_policy))
                                }
                            },
                            style = TextStyle(fontSize = 13.sp, color = Color.Gray)
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    CustomButton(
                        text = stringResource(id = R.string.register_button_text),
                        onClick = { },
                        backgroundColor = Color(0xFF003366),
                        modifier = Modifier.fillMaxWidth()
                    )

                    DividerWithText(
                        text = stringResource(id = R.string.continue_with),
                        modifier = Modifier.padding(vertical = 24.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        CustomButton(
                            text = stringResource(id = R.string.login_google),
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
                            text = stringResource(id = R.string.login_apple),
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

            Spacer(modifier = Modifier.height(32.dp))

            BasicText(
                text = buildAnnotatedString {
                    append(stringResource(id = R.string.already_have_account))
                    withStyle(style = SpanStyle(color = Color(0xFF003366), fontWeight = FontWeight.Bold)) {
                        append(stringResource(id = R.string.login_link))
                    }
                },
                modifier = Modifier
                    .padding(bottom = 40.dp)
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
                    text = stringResource(id = R.string.terms_of_service),
                    style = TextStyle(color = Color.Gray, fontSize = 12.sp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .clickable { }
                )
                BasicText(
                    text = stringResource(id = R.string.privacy_policy),
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
fun SignUpPreview() {
    SignUp()
}
