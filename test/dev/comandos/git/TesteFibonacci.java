package dev.comandos.git;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteFibonacci {
	
	@Test
	public void testFibonnacciZero() {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(0, fibonacci.calcularFibonacci(0));
	}
	
	@Test
	public void testFibonnacciUm() {
		Fibonacci fibonacci = new Fibonacci();
		assertEquals(1, fibonacci.calcularFibonacci(1));
	}

}
