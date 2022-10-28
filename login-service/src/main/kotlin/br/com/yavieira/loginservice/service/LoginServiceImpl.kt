package br.com.yavieira.loginservice.service

import br.com.yavieira.loginservice.api.exception.Unauthorized
import br.com.yavieira.loginservice.feign.AdminClient
import br.com.yavieira.loginservice.jwt.JwtTokenProvider
import org.springframework.stereotype.Service

@Service
class LoginServiceImpl(
    val client: AdminClient,
    val jwtTokenProvider: JwtTokenProvider
) : LoginService {

    override fun login(email: String): String? {
        val admin = client.fetchAdminByEmail(email) ?: throw Unauthorized("User not found")

        return jwtTokenProvider.createToken(admin.email)
    }
}