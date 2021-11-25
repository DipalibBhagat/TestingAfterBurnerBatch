package oopsConcepts;

interface i1{
	 static int a=50;			//variables are public, static ,final
	void geerUp();
	void speedUp();
	default  void show() {			//java 8 ver can also create default concrete methods in interface.
		
		System.out.println("show results");
	}
	
}
interface i2{
	void breakDown();
	
}

public class InterfaceExample implements i1,i2 {
	
	 public void geerUp() {
		System.out.println("Geered Up ");
	}
	public void speedUp() {
		System.out.println("Speed Up");
		
	}
	public void breakDown() {
		System.out.println("Break Down");
	}
	public static void main(String[] args) {
		
		int a=100;
		InterfaceExample ie=new InterfaceExample();
		
		System.out.println(a);
		System.out.println(ie.a);
		//ie.a=450;
		ie.geerUp();
		ie.speedUp();
		ie.show();
	}
}
