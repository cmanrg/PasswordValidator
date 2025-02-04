package dev.cmanrg.passwordvalidator.password_validator.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.cmanrg.passwordvalidator.password_validator.presentation.components.PasswordValidatorForm

@Composable
fun PasswordValidatorScreen(
    viewModel: PasswordValidatorViewModel
) {
    val state = viewModel.state

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PasswordValidatorForm(state, onEvent = {
            viewModel.onEvent(it)
        })
    }
}

