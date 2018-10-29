import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
int a;
int b;
String result;
int operation;

System.out.println("Enter first value");

Scanner sc = new Scanner (System.in);

a = sc.nextInt();

System.out.println("Enter second value");
b = sc.nextInt();

System.out.println("Choose operation:" 
		+ " 1 - add"
		+ " 2 - substration"
		+ " 3 - devide" 
		+ " 4 - miltiply");
operation = sc.nextInt();


switch(operation) {
	case 1:
		//Double result = a + b;
	System.out.println("Result = " + (a + b));
	break;
	
	case 2:
	System.out.println("Result= " + (a - b));
	break;
	
	case 3:
	System.out.println("Result = " + (a / b));
	break;
	
	case 4:
	System.out.println("Result = " + (a * b));
	break;
	
	default:
         System.out.println("Illigal Operation");
}
	}
}
