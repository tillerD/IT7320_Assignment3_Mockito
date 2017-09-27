package source;

public class CalculatorMain {
	CalculatorMethods calcMeth;
	
	public void setCalcMeth(CalculatorMethods calcMeth) {
		this.calcMeth = calcMeth;
	}
	
	public int addition(int a, int b) {
		return calcMeth.add(a, b);
	}
	
	public int subtraction(int a, int b) {
		return calcMeth.subtract(a, b);
	}
	
	public int multiplication(int a, int b) {
		return calcMeth.multiply(a, b);
	}
	
	public double division(int a, int b) {
		return calcMeth.divide(a, b);
	}
}