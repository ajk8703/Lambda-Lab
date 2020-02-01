package Lab04;

import java.util.Scanner;

public class Lab04 {
	public static void main (String[] args) {
		
        Scanner in = new Scanner(System.in);
        String response = "";
        
        while (!(response.trim().equals("exit"))) {
            System.out.print("> ");
            response = in.nextLine();
            preprocess(response);
            



        }
        
        System.out.println("Goodbye!");
          
    }
	
	
	
	public static String preprocess(String unprocessedString) {
        char[] responseChar = unprocessedString.toCharArray();
        
		
		unprocessedString.trim();
		
		String processed = "";
		
		char[] unprocessed = unprocessedString.toCharArray();
				
        for (int i = 0; i < unprocessed.length; i++) {
        	char readChar = unprocessed[i];
        	
        	if(readChar == ';') {
        		break;
        	}
        	
        	else {
        		processed += readChar;
        	}
        	
        	
        	processed += " ";
        }
        
        if (processed.equals(""))
        	return processed;
        
        System.out.println(processed);
        return processed;
		
	}
}
