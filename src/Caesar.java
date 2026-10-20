import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Message: ");
		String message = in.nextLine();

		System.out.print("Cipher Shift: ");
		int s = in.nextInt();

		for (int z = 0; z < message.length(); z++) {

			if (Character.isLowerCase(message.charAt(z))) {

				char position = (char) (message.charAt(z) - 'a');

				char shift = (char) (position + s);

				char division = (char) ((shift % 26) + 'a');

				System.out.println("Encoded message: " + division);

				System.out.println("Encoded message: " + division);

			} else {

				System.out.print("");

			}

			if (Character.isUpperCase(message.charAt(z))) {

				char position = (char) (message.charAt(z) - 'A');

				char shift = (char) (position + s);

				char division = (char) ((shift % 26) + 'A');

				System.out.println("Encoded message: " + division);

			} else {

				System.out.print("");

			}

		}
	}
}
