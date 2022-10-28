package br.com.yavieira.loginservice.api.exception

import org.springframework.http.HttpStatus

abstract class ApiException(open val httpStatus: HttpStatus) : RuntimeException() {
    open fun toMessage() = ErrorMessage(httpStatus.name)
}

class Unauthorized(override val message: String) : ApiException(HttpStatus.UNAUTHORIZED) {
    override fun toMessage() = ErrorMessage(message)
}