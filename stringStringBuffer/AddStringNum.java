package stringStringBuffer;

public class AddStringNum {
	public static void main(String[] args) {
		
		String ipstr=new String("c0un7ersi9n 7ec4n0l0gy");
		
		int sum=0;
		for(int i=0;i<ipstr.length();i++) {
		char ch=ipstr.charAt(i);
		if(Character.isDigit(ch)) {
			sum=sum+Character.getNumericValue(ch);
			
		}
		}
		System.out.println("Addition of digits from String:"+sum);
		
	}

}
