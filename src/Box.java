import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Message: ");
	     String message = in.nextLine();

	     System.out.print("Columms: ");
	     int Columms = Integer.parseInt(in.nextLine());
	     
     	String Chypher = "";
     	int counter = 0;
	        
	        for (int x = 0; x < Columms; x++) {

	            for (int y = x; y < message.length(); y = y + Columms) {

	                char letter = message.charAt(y);

	                Chypher = Chypher + letter;
	            }
	        }

	        System.out.println("Encoded message: " + Chypher);
	        
	}
}


