package Array;
import java.util.Arrays;
public class Array_4 {
   int num[]= {5,8,11,9,2,};
	public static void main(String[] args) {
		Array_4 ar = new Array_4();
		//ar.Finding_the_biggest_number();
		//ar.Finding_second_biggest_number();
		//ar.Finding_the_smallest_number();
		ar.Finding_the_second_smallest_number();
		

	}
	private void Finding_the_biggest_number() {
		int big=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>big)
				big = num[i];
		}
		System.out.println("Biggest no is "+big);
	}
	private void Finding_second_biggest_number() {   //5,8,11,2,9
		int big=0,sbig=0;							 //0,1, 2,3,4
		for(int i=0;i<num.length;i++) {
			if(big<num[i]) {
				sbig=big;
				big=num[i];
			}
			else if(sbig<num[i])
				sbig=num[i];
		}
		System.out.println("biggest number "+big);
		System.out.println("Second biggest number "+sbig);
	}
	private void Finding_the_smallest_number() {    //5,8,11,2,9
		int small=num[0];							//0,1, 2,3,4
		for(int i=0;i<num.length;i++) {
			if(small>num[i])
				small=num[i];
		}
		System.out.println("Smallest number "+small);
	}
	private void Finding_the_second_smallest_number() { 	//5,8,11,2,9
		int small=Integer.MAX_VALUE;						//0,1, 2,3,4
		int Ssmall=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++) {
			if(small>num[i]) {
				Ssmall = small;
				small = num[i];
			}
			else if(Ssmall>num[i])
				Ssmall = num[i];
		}
		System.out.println(Ssmall);
		
	}	
}
