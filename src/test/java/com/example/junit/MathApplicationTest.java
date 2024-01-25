package com.example.junit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

public class MathApplicationTest {

	@Test
	public void testAdd() {
		Calculator calculatorMock = mock(Calculator.class);
		when(calculatorMock.add(2, 3)).thenReturn(5);
		MathApplication mathApplication = new MathApplication(calculatorMock);
		Assert.assertEquals(5, mathApplication.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator calculatorMock = mock(Calculator.class);
		when(calculatorMock.sub(5, 2)).thenReturn(3);
		MathApplication mathApplication = new MathApplication(calculatorMock);
		Assert.assertEquals(3, mathApplication.subtract(5, 2));
	}

	@Test
	public void testMultiply() {
		Calculator calculatorMock = mock(Calculator.class);
		when(calculatorMock.multiply(2, 5)).thenReturn(10);
		MathApplication mathApplication = new MathApplication(calculatorMock);
		Assert.assertEquals(10, mathApplication.multiply(2, 5));
	}

	@Test
	public void testDivide() {
		Calculator calculatorMock = mock(Calculator.class);
		when(calculatorMock.divide(20, 5)).thenReturn(4);
		MathApplication mathApplication = new MathApplication(calculatorMock);
		Assert.assertEquals(4, mathApplication.divide(20, 5));
	}

}
