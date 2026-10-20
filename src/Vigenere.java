import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Message: ");
		String message = in.nextLine();
		System.out.print("Viegnere: ");
		String viegnere = in.nextLine();
		int Counter = 0;

		for (int z = 0; z < message.length(); z++) {

			char Final = 0;
			char Chypher = 0;

			if (Character.isLowerCase(message.charAt(z))) {
				char positionA = (char) (message.charAt(z) - 'a');
				char positionAV = (char) ((viegnere.charAt(Counter) - 'a'));
				Chypher = (char) (positionA + positionAV);
				Final = (char) ((Chypher % 26) + 'a');
				System.out.print(Final);

			} else {

				System.out.print(" ");

			}

			if (Character.isUpperCase(message.charAt(z))) {
				char positiona = (char) (message.charAt(z) - 'A');
				char positionaV = (char) (viegnere.charAt(Counter) - 'A');
				Chypher = (char) (positiona + positionaV);
				Final = (char) ((Chypher % 26) + 'A');
				System.out.print(Final);

			} else {

				System.out.print(" ");

			}

			Counter++;

		}

	}

}
