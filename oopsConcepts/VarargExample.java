package oopsConcepts;



public class VarargExample {
	  static int sum=0;
	public static void addition(int ...a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		
		for(int j=0;j<a.length;j++) {
			sum=sum+a[j];
			break;
			
		}
		System.out.println("Addition="+sum);
		
		
	}

	public static void main(String[] args) {
		addition(5);
		addition(5,2,3);
		
		
		
		
		
	}
}
