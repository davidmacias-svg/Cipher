import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Message: ");
	     String message = in.nextLine();

	     System.out.print("Columms: ");
	     int Columms = Integer.parseInt(in.nextLine());
	     
     	String XCounter = "";
     	String Chypher = "";
     	int counter = 0;

	     
	        for (int w = 0; w < message.length(); w++) {
	        	
                char M = message.charAt(w);
                
                if (M != ' ') {
                	
                	Chypher = Chypher + M;
                	
                }
	        	
	        }
	        	
	        while (message.length() % Columms != 0) {
	        	
	        	XCounter = XCounter + 'X';
	        	
	        }
	        	
	        
	        
	        for (int x = 0; x < Columms; x++) {

	            for (int y = x; y < message.length(); y = y + Columms) {

	                char letter = message.charAt(y);

	                Chypher = Chypher + letter;
	            }
	        }

	        System.out.println("Encoded message: " + Chypher);
	        
	}
}


