package LogicalPrograms;

/**
 * @author Neha Patil
 * Armstrong number program
 * An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits
 * For eg. 153=1^3+5^3+3^3=1+125+27=153, 2=2^1=2
 */
public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int rem;
		int sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not");
		}
	}
}
