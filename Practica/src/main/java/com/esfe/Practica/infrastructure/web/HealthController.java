package com.esfe.Practica.infrastructure.web;

import com.esfe.Practica.domain.port.in.CheckDbHealtUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/health")
public class HealthController {
    private final CheckDbHealtUseCase health;

    public HealthController(CheckDbHealtUseCase health){this.health=health;}


    @CrossOrigin(origins = "*")
    @GetMapping("/db")
    public ResponseEntity<Map<String, Object>>db(){
        boolean ok=health.isHealthy();
        return ResponseEntity.ok(Map.of("healthy", ok));
    }
}
