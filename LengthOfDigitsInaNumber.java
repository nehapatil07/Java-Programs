package LogicalPrograms;

public class LengthOfDigitsInaNumber {

	public static void main(String[] args) {
		int num=2345;
		int temp=num;
		int len=0;
		while(num!=0) {
			num=num/10;
			len=len+1;
		}
		System.out.println("Length of digits is "+len);
	}
}
