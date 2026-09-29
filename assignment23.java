import java.util.*;

public class Main {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                int j = map.get(complement);

                // Return indices in ascending order
                return new int[]{Math.min(i, j), Math.max(i, j)};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, 1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}
