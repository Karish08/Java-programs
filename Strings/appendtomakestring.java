import java.util.Scanner;

public class appendtomakestring {
    public static int appendCharacters(String s, String t) {
        int k = 0;
        int count = 0;
        for (int i = 0; i < s.length() && k < t.length(); i++) {
            if (s.charAt(i) == t.charAt(k)) {
                k++;
                count++;
            }
        }
        return t.length() - count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        int result = appendCharacters(s, t);
        System.out.println("Characters to append: " + result);
    }
}