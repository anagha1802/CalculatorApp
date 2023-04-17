
public class Calculator {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		Math m = new Math();
		
		m.add(a, b);
		m.sub(b,a);
		m.multiplication(a, b);
		m.divide(b,a);
		m.square(a);
		m.cube(a);
	}

}
