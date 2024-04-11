package LogicalPrograms;

/**
 * @author Neha Patil
 * Program for factorial number
 * Factorial of number is denoted by n!
 * For eg. 4!=4*3*2*1=24
 */
public class FactorialNumber {

	
	public static void checkFactorialNumber(int num) {
		int fact=1;
		for(int i=1; i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of num "+num+" is "+fact);
	}
	
	public static void main(String[] args) {
		checkFactorialNumber(5);
	}
}
