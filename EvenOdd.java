package LogicalPrograms;

/**
 * @author Neha Patil
 * Even odd number program
 * If a positive number when divided by 2 gives the reminder as 0, then its even number otherwise its odd
 */
public class EvenOdd {
public static int a[]= {2,5,6,7,3,5,8};

public static void main(String[] args) {
	//testEvenOdd(88);
	//EvenOddUsingArrayWithForLoop();
	//EvenOddUsingArrayWithWhileLoop();
	//EvenOddUsingArrayWithDoWhileLoop();
}

	public static void testEvenOdd(int number) {
		if(number%2==0 && number!=0) {
			System.out.println(number+" is even number");
		} else {
			System.out.println(number+" is odd number");
		}
	}
	
	public static void EvenOddUsingArrayWithForLoop() {
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is even number");
			} else {
				System.out.println(a[i]+" is odd number");
			}
		}
	}
	
	public static void EvenOddUsingArrayWithWhileLoop() {
		int i=0;
		while(i<a.length) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" is even number");
			} else {
				System.out.println(a[i]+" is odd number");
			}
			i++;
		}
	}
	
	public static void EvenOddUsingArrayWithDoWhileLoop() {
		int i=0;
		do
		{
			if(a[i]%2==0) {
				System.out.println(a[i]+" is even number");
			} else {
				System.out.println(a[i]+" is odd number");
			}
			i++;
		}
		while(i<a.length);
	}
		
}
