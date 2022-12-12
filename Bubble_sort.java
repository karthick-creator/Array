package Array;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] br= {50,40,30,20,10,98,34,98,45,23};
		for(int j=1;j<br.length;j++)
		{

		for(int i=0;i<br.length-j;i++)
		{
			if(br[i]>br[i+1])
			{
				int temp=br[i];
				br[i]=br[i+1];
				br[i+1]=temp;
			}
			
		}
		}
		
		for(int i=0;i<br.length;i++)
		{
			System.out.println(br[i]);
		}
		

	}

}
