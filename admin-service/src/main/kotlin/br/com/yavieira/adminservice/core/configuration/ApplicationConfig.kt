package br.com.yavieira.adminservice.core.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer

@Configuration
@PropertySource("classpath:startup.properties")
class ApplicationConfig {

    @Bean
    fun propertyConfig() : PropertySourcesPlaceholderConfigurer{
        return PropertySourcesPlaceholderConfigurer()
    }
}