package dev.cmanrg.passwordvalidator.password_validator.presentation

sealed interface PasswordValidatorEvent {
    data class ChangePassword(val password: String) : PasswordValidatorEvent
    data object ValidatePassword : PasswordValidatorEvent
}