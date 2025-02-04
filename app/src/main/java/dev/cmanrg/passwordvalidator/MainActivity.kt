package dev.cmanrg.passwordvalidator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.cmanrg.passwordvalidator.password_validator.data.repository.PasswordValidatorRepositoryImpl
import dev.cmanrg.passwordvalidator.password_validator.domain.usecase.SavePasswordUseCase
import dev.cmanrg.passwordvalidator.password_validator.domain.usecase.ValidatePasswordUseCase
import dev.cmanrg.passwordvalidator.password_validator.presentation.PasswordValidatorScreen
import dev.cmanrg.passwordvalidator.password_validator.presentation.PasswordValidatorViewModel
import dev.cmanrg.passwordvalidator.ui.theme.PasswordValidatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PasswordValidatorTheme {
                // Damos vida al view model PasswordValidatorViewModel
                val viewModel = PasswordValidatorViewModel(
                    passwordUseCase = ValidatePasswordUseCase(),
                    savePasswordUseCase = SavePasswordUseCase(PasswordValidatorRepositoryImpl())
                )
                PasswordValidatorScreen(viewModel)
            }
        }
    }
}

