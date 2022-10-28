package br.com.yavieira.loginservice.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import java.io.Serializable

@FeignClient(name = "admin-service", url = "http://admin-service.eba-mk8crv3y.us-east-1.elasticbeanstalk.com/")
@Service
interface AdminClient {

    @GetMapping("/user", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun fetchAdminByEmail(@RequestHeader email: String): AdminDTO?

}

data class AdminDTO(
    val username: String,
    val email: String,
    val password: String,
    val roles: List<String>
) : Serializable


