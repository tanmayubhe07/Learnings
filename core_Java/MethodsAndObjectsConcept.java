package core_Java;

public class MethodsAndObjectsConcept {

	public void getData()
	{
		System.out.println("Hello World");
	}
	
	public static void getUserData() {
		System.out.println("Hello worl with static keyword");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAndObjectsConcept obj = new MethodsAndObjectsConcept();
		obj.getData();
		getUserData();  // with the help of static keyword in the method we can use that method without creating object 
	
		 

	}

}
