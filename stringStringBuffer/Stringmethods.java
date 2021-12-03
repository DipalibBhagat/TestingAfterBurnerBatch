package stringStringBuffer;

public class Stringmethods {
	public static void main(String[] args) {
		
		String str= new String("java program");
		String str1= new String("selenium");
		String str2= new String("Selenium");
		
		System.out.println("Output for contenEquals()");
		boolean res= str1.contentEquals("selenium");
		System.out.println(res);
		
		boolean res1= str1.contentEquals(str1);
		System.out.println(res1);
		
		boolean res2= str.contentEquals("java");
		System.out.println(res2);
		
		System.out.println("Output for endsWith()");
		boolean en=str1.endsWith("m");
		System.out.println(en);
		
		boolean en1=str.endsWith("p");
		System.out.println(en1);
		
		boolean en2=str1.endsWith("M");
		System.out.println(en2);
		
		char c= str.charAt(3);
		System.out.println(c);
		
		int i= str.compareTo("java program111S");
		System.out.println(i);
		
		int compare= str1.compareToIgnoreCase(str2);
		System.out.println(compare);
		
		String s= str1.concat("webdriver");
		System.out.println(s);
		
		boolean b=s.contains(str1);
		System.out.println(b);
		
		StringBuffer sb=new StringBuffer("selenium");
		System.out.println(sb);
		
		boolean b1= str1.equalsIgnoreCase(str2);
		System.out.println(b1);
		
		int index=str.indexOf('e');
		System.out.println("index="+index);
		
		int index1=str1.indexOf('e',2);
		System.out.println("second index="+index1);
		
		int index2=str1.indexOf("um");
		System.out.println(index2);
		
		int index3=str1.indexOf("en", 2);
		System.out.println(index3);
		
		int index4= str1.lastIndexOf('e');
		System.out.println("Last Index "+index4);
		
		System.out.println(str1.startsWith("se"));
		
		String str4= new String();
		
		str4=str1.replace('e', '*');
		System.out.println(str4);
		
		str4=s.replaceAll("e", "@");
		System.out.println(str4);
		str4=s.replaceFirst("s", "#");
		System.out.println(str4);
		
		String[] arr= str.split(" ");
		for(String s1:arr) {
			System.out.println(s1);
			
		}
		
		String str3= s.substring(8);
		System.out.println(str3);
		str3=s.substring(0, 8);
		System.out.println(str3);
		
		
		
		
				
		
		
		
		
		
		
		
		

		
		
		
	}

}
