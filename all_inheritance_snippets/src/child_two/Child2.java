package child_two;
import child_one.Child1;

public class Child2 extends Child1{
	private String Lname;
	
	//default constructor
	public Child2() {}
	
	//overloaded constructor
	public Child2(String Name,int Fees,String Lname) {
		super(Name,Fees);
		this.Lname = Lname;
	}
	
	public void display3() {
		System.out.println("Name:" + super.getName()+ "Fees:" +super.getFees()+ " LastName is: "+Lname);
	}
}
