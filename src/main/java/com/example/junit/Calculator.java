package com.example.junit;

public class Calculator {
	
	int add(int a, int b) {
		return a+b;
	}

	int sub(int a, int b) {
		return Math.abs(a-b);
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
	
	int divide(int a, int b) {
		return a/b;
	}
}
