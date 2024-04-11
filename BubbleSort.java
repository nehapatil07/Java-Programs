package LogicalPrograms;

/**
 * @author Patil
 * In bubble sort, the next number is compared with previous number and if its greater then swapping is done.
 */
public class BubbleSort {

 
	public static void main(String[] args) {
		int[] a= {1,3,5,2,4};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length-1;j++) {
				if(a[i]>a[j+1]){
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
