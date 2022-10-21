
public class CoreJavaBrushup4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object (remember that) or String literal . The "New indicates that its a 
		
		//String s1 = "Michele CMS Worldlink"; //Java will recognize this as the same object because it has the same value written for the object.
		String s5 = "hello"; //A new object is created in this instance
		//New
		String s2 = new String("Welcome");
		String S3 = new String("Welcome");
		
		//Splitting method - you can add spaces and create an array list as well ( you can add a space in the s.split parantheses) you can also add a break
		String s = "Michele CMS Worldlink";
		String [] splittedString = s.split("CMS");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		
		for (int i=0; i<s.length();i++)
		
		System.out.println(s.charAt(i));
		
	}
		
		
}
