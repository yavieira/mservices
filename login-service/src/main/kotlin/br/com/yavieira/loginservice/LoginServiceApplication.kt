package br.com.yavieira.loginservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class LoginServiceApplication

fun main(args: Array<String>) {
	runApplication<LoginServiceApplication>(*args)
}
