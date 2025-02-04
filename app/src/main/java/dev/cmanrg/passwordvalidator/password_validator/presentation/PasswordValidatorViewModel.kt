package dev.cmanrg.passwordvalidator.password_validator.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.cmanrg.passwordvalidator.password_validator.domain.usecase.SavePasswordUseCase
import dev.cmanrg.passwordvalidator.password_validator.domain.usecase.ValidatePasswordUseCase
import kotlinx.coroutines.launch

class PasswordValidatorViewModel constructor(
    private val passwordUseCase: ValidatePasswordUseCase,
    private val savePasswordUseCase: SavePasswordUseCase
) : ViewModel() {

    var state by mutableStateOf(PasswordValidatorState())
        private set


    fun onEvent(event: PasswordValidatorEvent) {
        when(event){
            is PasswordValidatorEvent.ChangePassword -> {
                state = state.copy(
                    password = event.password
                )
            }
            PasswordValidatorEvent.ValidatePassword -> {
                val isValid = passwordUseCase(state.password)
                state = state.copy(
                    error = !isValid
                )
                // TODO - Guardar la contraseña en caso de ser válida
                if (isValid){
                    viewModelScope.launch {
                        savePasswordUseCase(state.password)
                    }
                }
            }
        }
    }

}