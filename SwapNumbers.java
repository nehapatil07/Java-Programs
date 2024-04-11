package LogicalPrograms;

public class SwapNumbers {
	static int a=3;
	static int b=4;
	static int c;
	
	public static void swapUsingThirdVariable() {
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping the value of a is "+a+" and b is "+b);
	}
	
	public static void swapWithoutThirdVariable() {
		a=a+b;  // a=7
		b=a-b;  // b=7-4=3
		a=a-b;  // 7-3=4
		System.out.println("After swapping the value of a is "+a+" and b is "+b);
	}
	
public static void main(String[] args) {
	//swapUsingThirdVariable();
	swapWithoutThirdVariable();
}
}
