package reverseIndividualWordsInSentence;

import java.util.Scanner;

public class ReverseIndividualWords {

	static void reverseEachWordOfString(String input) {
		String[] words = input.split(" ");

		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(input);

		System.out.println(reverseString);
	}

	public static void main(String[] args) {
		System.out.println("Enter a sentence...");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		reverseEachWordOfString(sentence);
	}
}
