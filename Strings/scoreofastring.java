import java.util.Scanner;

public class scoreofastring {
    public static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int k = s.charAt(i);
            int b = s.charAt(i + 1);
            sum += Math.abs(b - k);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = scoreOfString(s);
        System.out.println("Score of string: " + result);
    }
}