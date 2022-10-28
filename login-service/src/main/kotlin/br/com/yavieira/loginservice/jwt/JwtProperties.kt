package br.com.yavieira.loginservice.jwt

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
data class JwtProperties(

    @Value("\${jwt.secretKey}")
    val secretKey: String,

    @Value("\${jwt.expiration}")
    val expiration: Long
)
