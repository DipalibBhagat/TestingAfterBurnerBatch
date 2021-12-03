package stringStringBuffer;

public class PalindromeExample {
	public static void printPalindrome(String str) {
		String oldstr=str;
		StringBuilder build=new StringBuilder(str);
		
		if(build.reverse().toString().equals(oldstr)) {
			System.out.println(oldstr);
		}
		
	}

	public static void main(String[] args) {
		
		String aa[]= {"madam","one","nayan","ten","mom","dad"};
		String arr1[]= new String[aa.length];
		StringBuffer sb=new StringBuffer();
		
		//String[] str=new String{};
		
		
		for(int i=0;i<aa.length;i++) {
			printPalindrome(aa[i]);
			
	
			
				
				
			
		}
		
		
		}
		
		
			
			
				
		}
		
		
		
			
			
		
//			
		
	




