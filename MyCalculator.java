package week1.day2.assignments;


public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println("sum is:" +calc.add(2,3,5));
		System.out.println("Difference is:" +calc.sub(3,2));
		System.out.println("Multiplication is:" +calc.mul(7878.7324374827, 7878.898723847));
		System.out.println("Divison is:" +calc.div(7.5f , 5.5f));
		
	}
	
	

}
