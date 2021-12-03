package stringStringBuffer;

public class StringArray {
	public static void main(String[] args) {
		
		//find out string from array which ends with "ed".
		String arr1[]= {"current ","executed","created","copy","heated"};
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i].endsWith("ed")==true) {
				System.out.println(arr1[i]);
				
			}
		}
	}

}
