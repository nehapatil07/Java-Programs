package LogicalPrograms;

/**
 * @author Patil
 * palindrome is a number which is its replica means after reversal the number will look the same.
 * For eg. 141, 232, 424 etc.
 */
public class Palindrome {

	public static void checkPalindrome(int number) {
		int sum=0;
		int rem;
		int temp=number;     //because we want to save original value of number while doing operations on it
		
		while(number>0) {
			rem=number%10;    //rem=121%10=1          rem=12%10=2        rem=1%10=1   
			sum=(sum*10)+rem; //sum=0+1=1             sum=1*10+2=12		 sum=(12*10)+1=121
			number=number/10; //number=121/10=12      number=12/10=1     number=1/10=0
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
	
	
	public static void stringPalindrome(String str) {
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
	public static void main(String[] args) {
		checkPalindrome(121);
	}
}
