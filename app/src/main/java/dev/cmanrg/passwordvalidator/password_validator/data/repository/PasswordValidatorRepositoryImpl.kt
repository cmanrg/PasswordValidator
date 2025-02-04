package dev.cmanrg.passwordvalidator.password_validator.data.repository

import dev.cmanrg.passwordvalidator.password_validator.domain.repository.PasswordValidatorRepository

class PasswordValidatorRepositoryImpl : PasswordValidatorRepository{
    private val myPassword: MutableList<String> = mutableListOf()

    override suspend fun savePassword(password: String) {
        println("La contraseña a guardar es $password")
    }
}