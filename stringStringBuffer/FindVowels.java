package stringStringBuffer;

public class FindVowels {
public static void main(String[] args) {
	
	//find vowels from string.
	String str= new String("selenium");
	String s=new String("core java");
	
	for(int i=0;i<str.length();i++) {
		
		char c=str.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c);
		}
	}
	
	boolean cont=s.endsWith("a");
	System.out.println(cont);
	
	boolean conts=s.endsWith("e");
	System.out.println(conts);
	
}

}
