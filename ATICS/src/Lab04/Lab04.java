package Lab04;

import java.util.Scanner;

public class Lab04 {
	public static void main (String[] args) {
		
        Scanner in = new Scanner(System.in);
        String response = "";
        
        while (true) {
            System.out.print("> ");
            response = in.nextLine();
            
            if (response.trim().equals("exit")) {
                System.out.println("Goodbye!");
                break;
        	}
            
            if(response.equals("")){
            	continue;
            }
           System.out.println(preprocess(response));
           Expression expr = (expressionify(preprocess(response)));
           
        } 
    }
	
	
	
	private static String preprocess(String unprocessedString) {
		
        char[] responseChar = unprocessedString.toCharArray();
		
		unprocessedString.trim();
		
		String processed = "";
		
		char[] unprocessed = unprocessedString.toCharArray();
				
        for (int i = 0; i < unprocessed.length; i++) {
        	char readChar = unprocessed[i];
        	
        	if(readChar == ';') {
        		break;
        	}
        	
        	else if (readChar == '\\') {
        		
        	}
        	
        	else if (readChar == ' ')
        		continue;
        	
        	else {
        		processed += readChar;
        	}
        	
        	
        	processed += " ";
        }
        
        return processed;
		
	}

	
	private static Expression expressionify(String abc) {
		Expression expr = new Variable (abc);
		return expr;
	}
	
	
	
}
