package HomeWork;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String str1 = "listen";
        String str2 = "silent";
        
        if(str1.length()!= str2.length()) {
        	System.out.println("String are not Anagram");
        }
        else {
        	char[]ch1 = str1.toCharArray();
        	char[]ch2 = str2.toCharArray();
        	
        	Arrays.sort(ch1); 
        	Arrays.sort(ch2 );
        	
        	if(Arrays.equals(ch1, ch2)) {
        		System.out.println("String are Anagram");
        	}
        	else {
        		System.out.println("String are not Anagram");
        	}
        }   
	}
}
