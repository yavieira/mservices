package br.com.yavieira.loginservice.jwt

import org.springframework.stereotype.Component

import java.util.Base64
import java.util.Date
import javax.annotation.PostConstruct

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm

import br.com.yavieira.loginservice.constants.JwtConstants.Companion.JWT_KEY

@Component
class JwtTokenProvider(
    val jwtProperties: JwtProperties,
) {

    lateinit var secretKey: String

    @PostConstruct
    protected fun init() {
        secretKey = Base64.getEncoder().encodeToString(jwtProperties.secretKey.encodeToByteArray())
    }

    fun createToken(email: String): String = Jwts.builder()
        .setSubject(email)
        .setIssuer(JWT_KEY)
        .setExpiration(calculateExpiration())
        .signWith(SignatureAlgorithm.HS256, secretKey)
        .compact()

    fun calculateExpiration() = Date(Date().time + jwtProperties.expiration)
}