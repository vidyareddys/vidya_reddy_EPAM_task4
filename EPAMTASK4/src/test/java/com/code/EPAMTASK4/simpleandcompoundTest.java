package com.code.EPAMTASK4;
import org.junit.*;
import static org.junit.Assert.*;
public class simpleandcompoundTest {
	public void test() {
		simpleandcompound sc = new simpleandcompound();
		double answer = sc.simpleInterest(500, 20, 5);
		assertEquals(500, answer,0.1);
		answer = sc.compoundInterest(500, 10, 2);
		assertEquals(105,answer,0.1);
	}
}
