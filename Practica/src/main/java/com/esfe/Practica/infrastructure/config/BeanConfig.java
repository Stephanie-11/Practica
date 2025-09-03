package com.esfe.Practica.infrastructure.config;

import com.esfe.Practica.application.usecase.CheckDbHealthService;
import com.esfe.Practica.domain.port.in.CheckDbHealtUseCase;
import com.esfe.Practica.domain.port.out.SqlHealthPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*Wiring: conecta puertos del dominio con adaptadores concretos*/
@Configuration
public class BeanConfig {
    @Bean
    CheckDbHealtUseCase checkDbHealtUseCase(SqlHealthPort port){

        return new CheckDbHealthService(port);
    }
}
