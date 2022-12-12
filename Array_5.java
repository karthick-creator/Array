package Array;

import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array ");
		int len = sc.nextInt();
		System.out.println("Enter the array ");
		int num[]= new int[len];
		for(int i=0;i<len;i++) {
			num[i]=sc.nextInt();
		}
		//linear search
/*		int n=234;
		for(int i=0;i<len;i++) {
			if(num[i]==n) {
				System.out.println(n+" is in the array!");
				break;}
			else if (i==len-1)
				System.out.println(n+" is not in the array!");
		}			*/
		
		//Binary search
		int n=4;
		int start=0;
		int end=len-1;
		int mid = (start+end)/2;
		while(start<=end) {
			if(n==num[mid]) {
				System.out.println(n+" is in position "+mid);
				break;
			}
			else if(n>num[mid]) {
				start=mid+1;
			}
			else if(n<num[mid]) {
				end=mid-1;
			}
			
		}
		
		
	}

}
