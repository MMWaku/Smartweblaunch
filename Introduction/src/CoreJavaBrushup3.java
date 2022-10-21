import java.util.ArrayList;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;

		String website = "Rahul Shetty Academy";

		char letter = 'r';

		double dec = 5.99;

		boolean myCard = true;



		//System.out.println(myNum+"is the value stored in the myNum variable");
		
		//System.out.print(website);
		
		// Arrays : How to set up an Array
		
		int[] arr= new int[5];
		
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		arr[4]= 5;
		
		//Quicker way to set up an array 
		
		int[]arr2= {1,2,3,4,5};
		

		//Example of selecting from an array. Must print out the index [0-4] for which value you want to select
		
		//System.out.print(arr2[0]);
	
		//For loops: If you would like to view the entire output of your array. (arr.length is 5)
		
		//for(int i=0;i<arr.length;i++)
		
		//System.out.print(arr[i]);
		
		//String[] name = {"Michele", "CMS Global", "Proship"};
		
		//for(String s: name)
			
		//System.out.println(s);
		
		//Conditional statements inside loops
		
		int[] arr3 = {1,2,3,4,5,6,7,8,9,10,122};
		
		//Only even numbers 
		
		for (int i=0; i<arr3.length;i++)
		{
//IF/ Else conditions
		if (arr3[i] % 2 == 0)
		{	
			System.out.println(arr3[i]);
		    }
			else
			{ 
				System.out.println(arr3[i] +"is not multiple of 2");
			}
	
		}
		//How to create an Arraylist: Add, remove and extract. Example below shows extracting the 2nd index which is "selenium"
		ArrayList<String> a = new ArrayList();
		a.add("Michele");
		a.add("CMS");
		a.add("Selenium");
		System.out.println(a.get(2));
		//create object of the class- object.method
		
	}            
}
	



	
	
	
	
                                






