package LogicalPrograms;

/**
 * @author Neha Patil
 * Fibonacci series program
 * fibonacci series is the sequence in which each number is the sum of preceding two
 */
public class FibonacciSeries {
	//0,1,2,3,5,8...

	public static void fibonacciSeries1() {
		int a=0;
		int b=1; 
		int c;
		System.out.print(a+" "+b);
		for(int i=2; i<10;i++) { //0 and 1 are already printed
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		fibonacciSeries1();
	}
}
