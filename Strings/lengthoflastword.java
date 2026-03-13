import java.util.Scanner;

public class lengthoflastword {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);
        System.out.println("Length of last word: " + result);
    }
}