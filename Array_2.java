package Array;

import java.util.Scanner;

public class Array_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("array length");
		int len = sc.nextInt();
		int sub[] = new int[len];
		
		System.out.println("list of numbers");
		for(int i=0;i<len;i++) 
		{
		sub[i]= sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("list of numbers");
		for(int i =0;i<len;i++) 
		{
			System.out.println(sub[i]);
		}
	}
}
