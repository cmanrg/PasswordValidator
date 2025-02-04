package dev.cmanrg.passwordvalidator.password_validator.domain.repository

interface PasswordValidatorRepository {

    suspend fun savePassword(password: String)
}