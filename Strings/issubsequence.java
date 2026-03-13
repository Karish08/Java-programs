import java.util.Scanner;

public class issubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subsequence string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter target string (t): ");
        String t = sc.nextLine();

        int k = 0;
        for (int i = 0; i < t.length() && k < s.length(); i++) {
            if (s.charAt(k) == t.charAt(i)) {
                k++;
            }
        }

        if (k == s.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}