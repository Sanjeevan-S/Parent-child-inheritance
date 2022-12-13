package child_one;
import parent.Parent;

public class Child1 extends Parent{
	private String Course;
	private int Fees;
	
	//default constructor
	public Child1(){}
	
	//overloaded constructor
	public Child1(String Name, String ID, String Course,int Phno, int Fees)
	{
		super(Name,ID,Phno);
		this.setCourse(Course);
		this.Fees = Fees;
	}
	
	//overloaded Constructor #2
	public Child1(String Name,int Fees) {
		this.setName(Name);
		this.Fees = Fees;
	}
	
	//setter for Course that makes sure Course field cannot be empty
	public void setCourse(String Course) {
		if(Course.isEmpty()) {
			System.out.println("Course cannot be empty");
		}
		else {
			this.Course = Course;
		}
	}
	
	//simple display method
	public void display2() {
		System.out.println("This is Name: "+super.getName());
	}
	
	//setter for fees
	public void setFees(int Fees) {
		this.Fees= Fees;
	}
	
	public int getFees() {
		return this.Fees;
	}
	
}
