package core_Java;

public class InheritedChild2 extends ParentInheritence{
	
	int a;
	
	public InheritedChild2(int a) {
		super(a);  // Activates Parent class constructor
		this.a=a;  //this keyword is used to send value of variable to local variable 
	}
	
	public int increment() {
		a=a+1;
		return a;
	}
	

}
