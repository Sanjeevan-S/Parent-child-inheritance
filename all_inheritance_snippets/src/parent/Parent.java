package parent;

public class Parent {
	private String Name,ID,Role;
	private int Phno,Salary;
	private int bonus;
	
	//overloaded constructor
	public Parent(String Name,String ID,String Role,int Phno,int Salary,int bonus) {
		this.Name =Name;
		this.ID = ID;
		this.Role = Role;
		this.Phno = Phno;
		this.Salary = Salary;
		this.setbonus(bonus);
	}
	
	//overloaded constructor #2
	public Parent(String Name,String ID,int Phno) {
		this.setName(Name);
		this.ID = ID;
		this.Phno = Phno;
	}
	
	
	//default constructor
	public Parent() {}
	
	//getter for bonus
	public int getbonus() {
		return bonus;
	}
	
	//getter for Name
	public String getName() {
		return this.Name;
	}
	//setter for Name
	public void setName(String Name) {
		this.Name = Name;
	}
	
	//setter for bonus
	public void setbonus(int bonus) {
		if (bonus <0) {
			this.bonus = 0;
			System.out.println("bonus cannot be negative");
		}
		else {
			this.bonus = bonus;
		}
	}
	
	//simple Display method
	public void details() {
		System.out.println("Name: "+Name+" ID-no: "+ID+" phone number: "+Phno);
	}
	

	
	
	
}
