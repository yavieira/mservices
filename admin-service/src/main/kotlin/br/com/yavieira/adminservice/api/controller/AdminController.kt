package br.com.yavieira.adminservice.api.controller

import br.com.yavieira.adminservice.api.dto.AdminDTO
import br.com.yavieira.adminservice.core.repository.AdminRepository
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminController(
    private val repository: AdminRepository
) {

    @GetMapping("/users")
    fun getAdmins(): ResponseEntity<String> {
        return ResponseEntity.ok().body(repository.findAll().toString())
    }

    @GetMapping("/user", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun fetchAdminByEmail(@RequestHeader email: String) : ResponseEntity<AdminDTO?>{
        return ResponseEntity.ok().body(repository.fetchAdminByEmail(email)?.let { AdminDTO(it) })
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello!!!"
    }
}