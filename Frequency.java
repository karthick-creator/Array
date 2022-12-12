package Array;

public class Frequency {

	public static void main(String[] args) {
		int[] values = {10,20,30,40,50,30,20,39,10,50,30,10,10,10,10};
		int[] repeat= new int[values.length];
		
		
		for(int i=0;i<values.length;i++)
		{
			int count=1;
			for(int j=i+1;j<repeat.length;j++)
			{
				if(values[i]==values[j])
				{
					count++;
					repeat[j]=-1;
				}
			}
			if(repeat[i]!=-1) {
			repeat[i]=count;
			}
		}
		for(int i=0;i<values.length;i++)
		{
			if(repeat[i]!=-1)
			System.out.println(values[i]+" comes "+repeat[i]+" times ");
		}
	}

}
