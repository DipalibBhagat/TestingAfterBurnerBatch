package stringStringBuffer;

public class ReplaceExample {
	public static void main(String[] args) {
		
		String ipstr=new String("c0un7ersi9n 7ec4n0l0gy");
		//String opstr= new String();
		
		ipstr=ipstr.replaceAll("\\d","*");
	
		System.out.println(ipstr);
		
		
		

	}


}
