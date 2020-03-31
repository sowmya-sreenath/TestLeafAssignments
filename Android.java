/*Assignment 1 
Class-Android
Variables- long, boolean,string,int,float
call in main method and print them */

package week1.day1;

public class Android {
	//long 
	long number = 123456789;
	//boolean
	boolean isOn = false;
	//String
	String name = "Oneplus";
	//int
	int modelNum = 7;
	//float
	float price = 3900.1234f;

	public static void main(String[] args) {
		System.out.println("Android output");
		Android and1 = new Android();
		
		long n = and1.number;
		System.out.println(n);
		
		boolean bn=and1.isOn;
		System.out.println(bn);
		
		String str=and1.name;
		System.out.println(str);
		
		int i=and1.modelNum;
		System.out.println(i);
		
		float p=and1.price;
		System.out.println(p);
	}
}
