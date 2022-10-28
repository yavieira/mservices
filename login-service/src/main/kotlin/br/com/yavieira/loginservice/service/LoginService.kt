package br.com.yavieira.loginservice.service

interface LoginService {
    fun login(email: String): String?
}