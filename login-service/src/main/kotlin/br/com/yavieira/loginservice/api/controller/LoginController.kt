package br.com.yavieira.loginservice.api.controller

import br.com.yavieira.loginservice.api.exception.Unauthorized
import br.com.yavieira.loginservice.service.LoginService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/login")
class LoginController(private val loginService: LoginService) {

    @PostMapping
    fun login(@RequestHeader email: String): ResponseEntity<String> {
        return try {
            ResponseEntity.ok().body(loginService.login(email))
        } catch (exception: Unauthorized) {
            ResponseEntity.status(exception.httpStatus).body(exception.toMessage().message)
        }
    }
}