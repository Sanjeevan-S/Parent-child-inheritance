package parent;
import child_one.Child1;
import child_two.Child2;

public class App {


	public static void main(String[] args) {
		
		Parent obj1 = new Parent("Sanjeevan","E001","Employee",911,45000,1000);
			
		Child1 chld1 = new Child1("John","St001","IT",912,10000);
		
		Child2 chld2 = new Child2("Salad",150000,"San");
		//chld1.details();
		//obj1.details();
		//chld1.display2();
		chld2.display3();
	}
	
	
	

}
