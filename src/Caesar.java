import java.util.Scanner;

public class Caesar {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Message: ");
        String message = in.nextLine();
        
        System.out.print("Cipher Shift: ");
        int s = in.nextInt();
        
        System.out.println("Encrypted Message: " + caesarCipher(message, s));
    }

    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        shift = shift % 26;

        for (int z = 0; z < text.length(); z++) {
            char ch = text.charAt(z);

            if (Character.isUpperCase(ch)) {
                char encryptedCh = (char) (((ch - 'A' + shift + 26) % 26) + 'A');
                result.append(encryptedCh);
            } 

            else if (Character.isLowerCase(ch)) {
                char encryptedCh = (char) (((ch - 'a' + shift + 26) % 26) + 'a');
                result.append(encryptedCh);
            } 
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
