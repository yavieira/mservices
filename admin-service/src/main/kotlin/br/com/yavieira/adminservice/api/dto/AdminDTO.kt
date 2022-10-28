package br.com.yavieira.adminservice.api.dto

import br.com.yavieira.adminservice.core.entity.AdminEntity
import java.io.Serializable

data class AdminDTO(
    val username: String,
    val email: String,
    val password: String,
    val roles: List<String>
) : Serializable {

    constructor(entity: AdminEntity) : this(
        username = entity.username,
        email = entity.email,
        password = entity.password,
        roles = entity.roles
    )
}
