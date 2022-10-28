package br.com.yavieira.adminservice.core.startup

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "admin")
data class StartUpProperties(

    @Value("\${admin.username}")
    val username: String,

    @Value("\${admin.password}")
    val password: String,

    @Value("\${admin.status}")
    val status: Char,

    @Value("\${admin.email}")
    val email: String,
)
