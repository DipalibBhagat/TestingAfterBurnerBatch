package oopsConcepts;

public class SubClass extends SampleClass {
	public void a_method() {
		System.out.println("This is abstract method");
		
	}
	public static void main(String[] args) {
		
		//SampleClass c=new SubClass();
		SubClass subclass= new SubClass();
		subclass.a_method();
		subclass.NormalMethod();
		
	}

}
