package findingVowels;

public class FindingVowels {
	public static void main(String args[]) {

		String str = new String("Hello There! My name is AMATYA NAHAR...");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				System.out.println("Given sentence contains " + str.charAt(i) + " at the position " + (i + 1));
			}
		}
	}
}