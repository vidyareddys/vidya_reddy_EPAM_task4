package com.code.EPAMTASK4;

import org.junit.*;
import static org.junit.Assert.*;
public class CCT {
	@Test

	public void test() {

		CC cc = new CC();

		double answer = cc.costForConstructionMaterial("Standard", 500, false);

		assertEquals(600000,answer,0.001);

	}
}
