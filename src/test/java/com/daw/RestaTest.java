package com.daw;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestaTest {
	@BeforeEach
	public void setUp() throws Exception {}
	
	@AfterEach
	public void tearDown() throws Exception{}
	
	@Test
	public void testResta() {
		double resultado = Resta.resta(2,2);
		
		assertTrue(resultado==0);
		
	}
}
