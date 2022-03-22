package week1.day2;

public class MyCalculator {
	
public static void main(String args[])	
	{	
	Calculator myCalc = new Calculator();
	
	System.out.println("Sum of three numbers: "+ myCalc.add(200, 400, 600));
	System.out.println("Subtraction: "+ myCalc.sub(500, 300));
	System.out.println("Multiplication: "+ myCalc.mul(250, 250));
	System.out.println("Division: " + myCalc.div(25, 2));
	
	}
	
}
