package LogicalPrograms;

public class LargestNumber {
	
public static void main(String[] args) {
	findLargestNumber();
}

public static void findLargestNumber() {
	int a=13;
	int b=25;
	int c=9;
	if(a>b && a>c) {
		System.out.println("number a is larger than b and c");
	} else if(b>a && b>c) {
		System.out.println("Number b is larger than a and c");
	} else {
		System.out.println("C is greater than a and c");
	}
}
}
