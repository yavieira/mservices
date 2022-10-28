package br.com.yavieira.adminservice.core.entity

import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "ADMIN")
@Entity
data class AdminEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val username: String,

    val email: String,

    val password: String,

    val status: Char,

    @ElementCollection(fetch = FetchType.EAGER)
    val roles: List<String> = listOf()
)