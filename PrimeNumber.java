package LogicalPrograms;

public class PrimeNumber {
static int count=0;

public static void main(String[] args) {
	//checkPrimeOrNot(37);
	printPrimes();
}

	public static void checkPrimeOrNot(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count!=0) {
			System.out.println(num+" is non prime");
		} else {
			System.out.println(num+" is prime");
		}
	}
	
	public static void printPrimes() {
		for(int i=2; i<10; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			} else {
				count=0;
			}
		}
	}
}
