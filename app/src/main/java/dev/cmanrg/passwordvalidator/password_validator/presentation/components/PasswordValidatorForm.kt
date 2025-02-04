package dev.cmanrg.passwordvalidator.password_validator.presentation.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.cmanrg.passwordvalidator.password_validator.presentation.PasswordValidatorEvent
import dev.cmanrg.passwordvalidator.password_validator.presentation.PasswordValidatorState

@Composable
fun PasswordValidatorForm(
    state: PasswordValidatorState,
    onEvent: (PasswordValidatorEvent) -> Unit

) {

    TextField(
        value = state.password,
        onValueChange = {
            onEvent(PasswordValidatorEvent.ChangePassword(it))
        }
    )
    Button(onClick = {
        onEvent(PasswordValidatorEvent.ValidatePassword)
    })
    {
        Text("Validar y Guardar")
    }

    if (state.error) {
        Text(text = "La contraseña es incorrecta", color = Color.Red)
    }

}