package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {

	private Suma suma;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
			//ejecuto la suma
		Suma suma = new Suma(2,3);
		int resultado = suma.suma();
		assertTrue(resultado==5);
	}

	

	@Test
	void testResta() {
		Suma suma = new Suma(2,3);
		int resultado = suma.resta();
		assertTrue(resultado==-1);
	}

}
