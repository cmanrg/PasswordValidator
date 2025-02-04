package dev.cmanrg.passwordvalidator.password_validator.domain.usecase

import dev.cmanrg.passwordvalidator.password_validator.domain.repository.PasswordValidatorRepository

class SavePasswordUseCase(private val repository:PasswordValidatorRepository) {

    suspend operator fun invoke(password: String) {
        repository.savePassword(password)
    }
}