package reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		boolean reverseTheWord = true;
		String userDecision = "";
		while (reverseTheWord) {
			

			System.out.println("Enter any word for reversing");
			Scanner sc = new Scanner(System.in);
			
			String input = sc.next();  
	        String reversed = "";  
	        
	        for (int i = input.length() - 1; i >= 0; i--) {  
	            reversed += input.charAt(i);  
	        }  
	        
	        System.out.println("Original String: " + input);  
	        System.out.println("Reversed String: " + reversed); 
			
	        System.out.println("Enter exit to stop or anything else to again enter a new word for reversing");
	        userDecision = sc.next();
	        if(userDecision.trim().equalsIgnoreCase("exit") || userDecision.isBlank() || userDecision.isEmpty()) {
	        	reverseTheWord = false;
	        	System.out.println("Program terminated!");
	        }
	        
		}
		 
	}

}
