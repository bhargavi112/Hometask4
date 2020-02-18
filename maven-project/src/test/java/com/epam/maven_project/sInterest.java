package com.epam.maven_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sInterest {

	@Test
	void test() {
		Cleancode code=new Cleancode();
		double out=code.sinterest(10,20,5);
		assertEquals(10,out);
	}

}
