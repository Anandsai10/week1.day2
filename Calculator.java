package week1.day2.assignments;

public class Calculator {
	String newline = System.getProperty("line.separator");

	public static void main(String[] args) {
		//String newline = System.lineSeparator();
	}
		
		public int add(int a, int b, int c)
		{
			System.out.println( "a value is:"+a + newline + "b value is:"+b + newline + "c value is:"+c);
			int sum= a+b+c;
			return sum;
		}
		public int sub(int a,int b)
		{
			System.out.println( "a value is:"+a + newline + "b value is:"+b );
			int diff= a-b;
			return diff;
		}
		
		public double mul(double a , double b)
		{
			System.out.println( "a value is:"+a + newline + "b value is:"+b );
			double multiply = a*b;
			return multiply;
		}
		public float div(float a , float b)
		{
			System.out.println( "a value is:"+a + newline+ "b value is:"+b );
			float division = a/b;
			return division;
		}
		
		
}


