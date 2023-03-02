package com.daw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EjemploTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Ejemplo ejemplo = new Ejemplo();
		
		//Cobertura de sentencias
		assertEquals( 1, ejemplo.prueba(1, 1));
		
		//Cobertura de decisiones
		assertEquals( 0, ejemplo.prueba(0, 1));
		
		//Cobertura de condiciones
		assertEquals( 0, ejemplo.prueba(1, 0));
		assertEquals( 0, ejemplo.prueba(0, 0));
				
	}
}
