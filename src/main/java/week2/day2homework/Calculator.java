package week2.day2homework;

public class Calculator {

public static int a;

	public int addingTwoNumbers(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void subTwoNum(int a, int b) {
	}
	
	public static int mulTwoNumbers(int a, int b) {
		int c = a*b;
		return c;
	}
	
	public int divTwoNumbers(int a, int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] siva)
	{
		Calculator first = new Calculator();
		int addition = first.addingTwoNumbers(555, 555);
		System.out.println("Added value is"+ "   :   " +addition);
		
		Calculator second = new Calculator();
		int division = second.divTwoNumbers(8888, 4);
		System.out.println("Divided value is"+  "   :   "+division);
			
		int multiplication = Calculator.mulTwoNumbers(50, 7000);
		System.out.println("Multiplied value is"+ "  :   "+multiplication);
		
	}
}
