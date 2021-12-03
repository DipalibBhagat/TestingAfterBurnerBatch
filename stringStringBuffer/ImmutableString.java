package stringStringBuffer;

public class ImmutableString {
	public static void main(String[] args) {
		
		String s="core";
		String s1="core";
		int num=98567;
		
		
		if(s.equals(s1)) {
			System.out.println("same");
			
		}
		else {
			System.out.println("not same");
		}
		
		//System.out.println(s.concat("java"));
		int rem=0;
		
		while(num>0) {
			int mod =num%10;
			rem=((rem*10)+mod);
			num=num/10;
			
		}
		System.out.println(+rem);
		

		
	}
	

}
