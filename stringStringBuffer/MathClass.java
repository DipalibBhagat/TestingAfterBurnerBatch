package stringStringBuffer;

import java.util.Arrays;

public class MathClass {
	public static void main(String[] args) {
//		int a=10;
//		int b=30;
//		System.out.println(Math.min(a, b));
		
		int arr[]= {115,15,5,80,150,60};
		int ma=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				ma=Math.max(ma,arr[j]);
			}
		}
		System.out.println("Maximum no:");
		System.out.println(ma);
		
	
		
	}

}
