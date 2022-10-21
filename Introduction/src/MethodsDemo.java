
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
	}
	//Why Method- in order to reuse same lines of codes. You can label it into a block so that you can reduce repetition 
	
	public String getData()
	
	{
	
	System.out.println("hello world");
	return "Michele Waku";
}
	



}
