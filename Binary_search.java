package Array;

public class Binary_search {

	public static void main(String[] args) {
		int br[]= {10,20,30,40,50};
		int c=9;
		int min=0;
		int max=br.length-1;
		
		while(min<=max)
		{
			int mid=(min+max)/2;
			if(br[mid]==c)
			{
				System.out.println(br[mid]+" found in the array");
				break;
			}
			else if(br[mid]>c)
			{
				max=mid-1;
			}
			else if(br[mid]<c)
			{
				min=mid+1;
			}
		}
		if(min>max)
		{
			System.out.println(c+" is not present");
		}
	}

}
