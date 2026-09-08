package pe.edu.upc.easysneaker.features.auth.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upc.easysneaker.core.theme.EasySneakerTheme
import pe.edu.upc.easysneaker.core.visibility
import pe.edu.upc.easysneaker.core.visibilityOff

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    val email = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }

    val isHiddenPassword = remember {
        mutableStateOf(true)
    }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        OutlinedTextField(
            value = email.value,
            onValueChange = {
                email.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            placeholder = {
                Text("Email")
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            placeholder = {
                Text("Password")
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        isHiddenPassword.value = !isHiddenPassword.value
                    }
                ) {
                    Icon(
                        if (isHiddenPassword.value)
                            visibilityOff else visibility,
                        contentDescription = "password"
                    )
                }
            },
            visualTransformation = if (isHiddenPassword.value)
                PasswordVisualTransformation()
            else VisualTransformation.None
        )
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    EasySneakerTheme {
        LoginScreen()
    }
}