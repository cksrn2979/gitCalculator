package calculator;

public class Calculator {
	public int sum(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}
	
	public int mul(int x, int y) {
		return x * y;
	}

	public double div (double x, double y){
		return (double)(x/y);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.sum(10, 20));
		System.out.println(calc.sub(10, 5));
		System.out.println(calc.mul(10, 3));
		System.out.println(calc.div(10, 3));
	}
}
