/*Написано 12.10.17
автор Александр Береговой
подсчет символов разных типов в строке
*/

import java.util.Scanner;

public class StringAnalise {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String string = scanner.nextLine();

		int digitNumber = 0;
		int letterNumber = 0;
		int spaceNumber = 0;
		int anotherSymbol = 0;

		for(int i=0; i<string.length(); i++) {



			if (Character.isDigit(string.charAt(i))) {

				digitNumber++;
			}
			else if (Character.isLetter(string.charAt(i))) {

				letterNumber++;
			}
			else (Character.isSpaceChar(string.charAt(i))) {

				spaceNumber++;
			}       
		}
		anotherSymbol = string.length()-digitNumber-letterNumber-spaceNumber;
		System.out.printf("%d   %d  %d  %d", digitNumber, letterNumber, spaceNumber, anotherSymbol);
    }
}