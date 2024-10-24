import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		System.out.println(
			"Result: " + reverseString(text, new String[]{"Java", "Ingress", "Welcome"})
		);
	}
	
	public static StringBuilder manipulateString(StringBuilder sb, String[] params) {
		String oldWord = params[0];
		String newWord = params[1];
		String insertedWord = params[2];
		sb.replace(sb.indexOf(oldWord), (sb.indexOf(oldWord) + oldWord.length()), newWord)
			.deleteCharAt(sb.indexOf("!"))
			.insert(0, insertedWord);
		return sb;
	}
	
	public static StringBuilder reverseString(String text, String[] params) {
		String[] words = text.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) sb.append(words[i]);
		return manipulateString(sb, params);
	}
}