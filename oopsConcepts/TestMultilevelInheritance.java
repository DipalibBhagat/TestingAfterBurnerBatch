package oopsConcepts;

public class TestMultilevelInheritance {
	public static void main(String[] args) {
		
		BabyDog bd=new BabyDog();
		
		bd.weep();
		bd.bark();
		bd.eat();
		
		Dog d=new Dog();
		
		d.bark();
		d.eat();
		//d.weep();  //the method weep() is undefined for the type Dog
		
		
		
	}

}
