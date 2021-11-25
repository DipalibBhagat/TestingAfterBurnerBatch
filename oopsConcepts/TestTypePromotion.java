package oopsConcepts;

public class TestTypePromotion {
	public void add(int a,int b) {
		System.out.println("Add Integers");
		
	}
	public void add(float a,float b) {
		System.out.println("Add Floats");
	}
	public void add(short a,short b) {
		System.out.println("Add Shorts");
	}
	
	public static void main(String[] args) {
		
		TestTypePromotion t=new TestTypePromotion();
		byte a=5;
		byte b=10;
		t.add(a, b);
		
		char c1='a';
		char c2= 'b';
		t.add(c1, c2);
		
		long l=6;
		long m=45;
		t.add(l, m);
		
		
		
		String s1="core ";
		String s2="java";
		//t.add(s1, s2);compile error ..can't convert string to integer.
	}

}
