package source;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalculatorMainTest extends TestCase {

	int num1;
	int num2;
	CalculatorMain calcMain;
	protected void setUp() throws Exception {
		num1 = 2;
		num2 = 3;
		calcMain = new CalculatorMain();
		CalculatorMethods mockObj = mock(CalculatorMethods.class);
		when(mockObj.add(num1, num2)).thenReturn(num1 + num2);
		when(mockObj.subtract(num2, num1)).thenReturn(num2 - num1);
		when(mockObj.multiply(num1, num2)).thenReturn(num1 * num2);
		when(mockObj.divide(num2, num1)).thenReturn((double)num2 / (double)num1);
		
		calcMain.setCalcMeth(mockObj);
	}

	protected void tearDown() throws Exception {
	}

	public void testAddition() {
		assertEquals(5, calcMain.addition(num1, num2));
	}

	public void testSubtraction() {
		assertEquals(1, calcMain.subtraction(num2, num1));
	}

	public void testMultiplication() {
		assertEquals(6, calcMain.multiplication(num1, num2));
	}

	public void testDivision() {
		assertEquals(1.5, calcMain.division(num2, num1));
	}

}
