import java.util.Scanner;

public class maxconsecutiveones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + result);
    }
}