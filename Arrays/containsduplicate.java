import java.util.Scanner;

public class containsduplicate {
    public static int[] getConcatenation(int[] nums) {
        int[] sr = new int[nums.length * 2];
        int k = 0;
        int b = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sr[k++] = nums[i];
            sr[b++] = nums[i];
        }
        return sr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = getConcatenation(nums);

        System.out.println("Concatenated array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}