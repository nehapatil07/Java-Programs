package LogicalPrograms;

public class PowerOfaNumber {

	
	public static void usingMathfunction(int num, int power) {
		double result;
		result=Math.pow(num, power);
		System.out.println("the "+power+"th power of number "+num+" is >>"+result);
	}
	
	public static void withoutMathfunction(int n, int p) {
		//n=number, p=power
		long result=1;
		 
		for(int i=0; i<=p;i++) {
			result *=n;
		}
		System.out.println(4+"th power of number "+n+" is "+result);
	}
	public static void main(String[] args) {
	//	usingMathfunction(5, 5);
		withoutMathfunction(2, 3);
	}
}
