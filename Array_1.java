package Array;

public class Array_1 {

	public static void main(String[] args) {
		int subject1[] = {45,36,78,93,65};
		int subject2[] = new int[5];
		int result[] = new int[5];
		subject2[0]=78;
		subject2[1]=45;
		subject2[2]=96;
		subject2[3]=12;
		subject2[4]=87;
		
		for(int i=0;i<subject1.length;i++)
		{
			System.out.println(subject1[i]);
			
		}
		System.out.println();
		
		for(int i=0;i<subject2.length;i++)
		{
			System.out.println(subject2[i]);
			
		}
		System.out.println();
		
		for(int i=0;i<result.length;i++) 
		{
			result[i]=subject1[i]+subject2[i];
			System.out.println(result[i]);
		}
	}

}
