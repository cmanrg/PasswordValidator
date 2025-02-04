package dev.cmanrg.passwordvalidator.password_validator.domain.usecase

class ValidatePasswordUseCase {
    /* TODO - UNA FORMA DE VALIDAR
    fun validate(password: String): Boolean {
        return password.length >= 8
    }*/

    operator fun invoke(password: String): Boolean {
        return password.length > 8
    }
}