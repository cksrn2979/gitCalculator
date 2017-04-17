package calculator;

public class Calculator {
	public int sum(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.sum(10, 20));
		System.out.println(calc.sum(10, 5));
	}
}
