package stringStringBuffer;

public class SortCharArray {
	public static void main(String[] args) {
		
		char ch[]= {'w','d','a','s','c','b','j'};
		
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[i]) {
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
				
			}
		}
		System.out.println("Sorted character Array:");
		for(int k=0;k<ch.length;k++) {
			System.out.print(ch[k]+" ");
			
		}
	}

}
