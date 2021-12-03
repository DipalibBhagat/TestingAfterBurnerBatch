package stringStringBuffer;

import java.util.Arrays;

public class ArraysClass {
	public static void main(String[] args) {
		char ch[]= {'a','q','s','g','d','f'};
		char ch1[]= {'s','r','t','a','l','w'};
		int arr11[]= {10,5,46,81,14,20,50};
		
		String str= new String();
		
//		Arrays.sort(ch);
//		System.out.println(ch);
//		
//		str=Arrays.toString(ch);
//		System.out.println(str);
//		
		System.out.println(ch1);
		
		Arrays.fill(ch, 'a');
		System.out.println(ch);
		Arrays.copyOf(ch1,'s');
		System.out.println(ch1);
		
		System.out.println(Arrays.equals(ch,ch1));
		
		int a[]=Arrays.copyOf(arr11, 5);
		for(int i:a) {
		System.out.println(i);
		}
	
	} 

}
