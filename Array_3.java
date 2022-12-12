package Array;

public class Array_3 {
	int sub1[]= {45,25,19,75,99};
	int sub2[]= new int[5];
	public static void main(String[] args) {
		
		Array_3 ar = new Array_3();
		//ar.Printing_in_reverse_order();
		//ar.finding_index_of_given_number();
//		ar.removing_given_number();
		//ar.placing_number_in_last_index();
		ar.How_many_times_given_element_present();
		
		
		}

	private void Printing_in_reverse_order() {
		for(int i=0;i<sub1.length;i++) {
			sub2[i]=sub1[sub1.length-1-i];
			System.out.println("Reverse of array "+sub2[i]);
		}
	}
	private void finding_index_of_given_number() {
		int number = 19;
		for(int i=0;i<sub1.length;i++) {
			if(number==sub1[i]) 
				System.out.println("The index of the given number is "+i);
		}
	}

	private void removing_given_number() {
	/*	int number =45;
		for(int i=0;i<sub1.length;i++) {
			if(number==sub1[i])
				sub1[i]=0;
			System.out.println(sub1[i]);
		}*/
		
		int sub3[]= new int[sub1.length-1];
		int Remove = 3,j=0;
		for(int i=0; i<sub1.length; i++) {
			if(Remove!=i) {
				sub3[j]=sub1[i];
				j++;
			}
		}
		System.out.println(sub3[j]);
	}

	private void placing_number_in_last_index() {
		int place_the_number = 55;
		for(int i=0;i<sub1.length;i++) {
			if(i==(sub1.length-1))
				sub1[i]=place_the_number;
			System.out.println(sub1[i]);
		}	
	}

	private void How_many_times_given_element_present() {
		int sub4[]= {34,45,34,12,45,34};
		int repeated = 45,count=0;
		for(int i=0;i<sub4.length;i++) {
			if(repeated == sub4[i])
				count++;
		}
		System.out.println("repeated given number "+count);
		
	}

}
