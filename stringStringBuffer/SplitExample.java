package stringStringBuffer;

public class SplitExample {
	public static void main(String[] args) {
		
		String ipst=new String("dipali bhagat");
		
		String[] arr= ipst.split(" ");
		System.out.println("Output String:");
		for(String s:arr) {
			String s1=s.substring(0,1);	//get first character
			String s2=s.substring(1);	//get remaining string
			s1=s1.toUpperCase();
			String s3=s1.concat(s2);
			System.out.print(s3+" ");
		}
	}

}
