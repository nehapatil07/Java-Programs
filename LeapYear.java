package LogicalPrograms;

import java.util.Scanner;

/**
 * @author Patil
 * Leap year program
 * Century year(ending with 00) is leap year only if it is divisible by both 4 and 400.
 * A leap year except century is exactly divisible by 4
 * Leap: comes after every 4 years. It has 366 days. (feb has 29 days)
 * If the year is divisible by 400 or its divisible by 4 and not 100
 */
public class LeapYear {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Non leap year");
		}
		
		
}
}