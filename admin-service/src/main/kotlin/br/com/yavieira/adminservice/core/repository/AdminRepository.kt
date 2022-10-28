package br.com.yavieira.adminservice.core.repository

import br.com.yavieira.adminservice.core.entity.AdminEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface AdminRepository : JpaRepository<AdminEntity, Long> {

    @Query("SELECT a FROM AdminEntity a where a.email = ?1")
    fun fetchAdminByEmail(email: String): AdminEntity?
}