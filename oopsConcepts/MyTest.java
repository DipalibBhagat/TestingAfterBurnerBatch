package oopsConcepts;

public class MyTest {
	public static void main(String[] args) {
		
		ChildClass ch= new ChildClass();
		System.out.println("Value of x:"+ch.x);
		ch.msg();
		ch.msg2();
		
		BaseClass bs= new ChildClass();
		System.out.println("Value of x:"+bs.x);
		//System.out.println("Value of y:"+bs.y);  compile error
		
		bs.msg();
		bs.msg2(); // compile error
		BaseClass b= new BaseClass();
		b.msg();
		b.msg2();
		
		
		
	
		
	}
}
