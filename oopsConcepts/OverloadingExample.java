package oopsConcepts;

public class OverloadingExample {
	public static void addition() {
		System.out.println("Addion without parameter");
		
	}
	public static void addition(int a ) {
		System.out.println("Addition with parameter");
	}
	public static void addition(int a,int b) {
		System.out.println("Addition="+(a+b));
		
	}
	public static void addition(String str1,String str2) {
		System.out.println(str1+" "+str2);
		
	}
	
	
	public static void main(String[] args) {
		
		addition();
		addition(4);
		addition(5,5);
		addition("core","java");
		
		
		
		
		
	}

}
