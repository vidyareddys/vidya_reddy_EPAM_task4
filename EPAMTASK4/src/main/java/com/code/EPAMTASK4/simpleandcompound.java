package com.code.EPAMTASK4;

public class simpleandcompound {
		public double simpleInterest(double principal,double rate,double time) {
			return (principal*rate*time)/100;
		}
		public double compoundInterest(double principal,double rate,double time) {
			return principal*(Math.pow(1+rate/100, time)-1);
		}
}
