package com.esfe.Practica;

import com.esfe.Practica.domain.port.in.CheckDbHealtUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
/*
* Prueba de humo: levanta el contexto real y ejecuta SELECT 1
* mediante el caso de uso. Requiere red/credenciales validos
*/
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DbConnectionSmokeTest {
	@Autowired CheckDbHealtUseCase health;
	@Test void shouldConnectAndSelectOne(){
		assertTrue(health.isHealthy(),
				"BD no respondio a SELECT 1; revisa credenciales/SSL/red.");
	}
	void contextLoads() {
	}

}
