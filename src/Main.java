import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static int largest(int[] arr) {
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }
        Comparator<String> comparator = (a, b) -> (b + a).compareTo(a + b);
        Arrays.sort(nums, comparator);
        if (nums[0].equals("0")) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        return Integer.valueOf(String.valueOf(sb));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(largest(array));
    }
}