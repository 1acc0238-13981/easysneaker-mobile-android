package pe.edu.upc.easysneaker.features.auth.presentation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import pe.edu.upc.easysneaker.core.designsystem.theme.EasySneakerTheme
import pe.edu.upc.easysneaker.core.designsystem.icon.visibility
import pe.edu.upc.easysneaker.core.designsystem.icon.visibilityOff

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel(),
    onLoginSuccess: () -> Unit
) {


    val state = viewModel.state.collectAsState().value

    LaunchedEffect(state.isAuthenticated) {
        if (state.isAuthenticated) {
            onLoginSuccess()
        }
    }

    Box {
        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            OutlinedTextField(
                value = state.email,
                onValueChange = viewModel::onEmailChanged,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                placeholder = {
                    Text("Email")
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = state.password,
                onValueChange = viewModel::onPasswordChanged,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                placeholder = {
                    Text("Password")
                },
                trailingIcon = {
                    IconButton(
                        onClick = viewModel::togglePasswordVisibility
                    ) {
                        Icon(
                            if (state.isHidden)
                                visibilityOff else visibility,
                            contentDescription = "password"
                        )
                    }
                },
                visualTransformation = if (state.isHidden)
                    PasswordVisualTransformation()
                else VisualTransformation.None
            )

            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = viewModel::login,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("Sign in")
            }
        }

        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    EasySneakerTheme {
        LoginScreen {}
    }
}