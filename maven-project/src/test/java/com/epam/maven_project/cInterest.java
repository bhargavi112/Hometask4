package com.epam.maven_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cInterest {

	@Test
	void test() {
		Cleancode code=new Cleancode();
		double out=code.cinterest(100,1,5);
		assertEquals(5,out);
	}
}
