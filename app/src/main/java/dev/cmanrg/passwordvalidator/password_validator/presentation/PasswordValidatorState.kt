package dev.cmanrg.passwordvalidator.password_validator.presentation

data class PasswordValidatorState(
    val password: String = "",
    val error: Boolean = false,
)
