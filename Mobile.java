package week1.day1;

public class Mobile {
	//boolean example
	boolean isTouch = true;
	
	//integer example
	int modelNumber = 7;
	
	//String example
	String mobileName = "OnePlus";
	
	
	public static void main(String[] args) {
		System.out.println("am ready!");
	Mobile mbl = new Mobile();
	
	//boolean call
	boolean bn = mbl.isTouch;
	
	//integer call
	int in = mbl.modelNumber;
	
	//String call
	String str = mbl.mobileName;
	//print the values
	System.out.println(bn);
	System.out.println(in);
	System.out.println(str);
	
	
	}

}
