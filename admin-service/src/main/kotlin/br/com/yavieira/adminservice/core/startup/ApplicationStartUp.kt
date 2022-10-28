package br.com.yavieira.adminservice.core.startup

import br.com.yavieira.adminservice.core.entity.AdminEntity
import br.com.yavieira.adminservice.core.repository.AdminRepository
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class ApplicationStartUp(
    private val adminRepository: AdminRepository,
    private val startUpProperties: StartUpProperties
) {

    @Bean
    fun loadData() {
        if (adminRepository.findAll().isEmpty()) {
            this.adminRepository.save(getAdmin())
        }
    }


    fun getAdmin(): AdminEntity {
        return AdminEntity(
            username = startUpProperties.username,
            email = startUpProperties.email,
            password = "12345",
            status = startUpProperties.status,
            roles = listOf("ADMIN")
        )
    }
}