package com.programaconsaba.desafios.basico;

import org.junit.Test;

import com.programaconsaba.desafios.test.DesafioTestBase;

public class NumerosParesTest extends DesafioTestBase {

	@Override
	public String getTestFileName() {
		return "NumerosPares.json";
	}
	
	@Test
	public void test() {
		String[] args = null;
		NumerosPares.main(args);
	}

}