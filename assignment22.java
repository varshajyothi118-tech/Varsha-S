import java.util.*;

public class Main {
    public static int countDistinctAbs(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(Math.abs(x));
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {-5, 5, -2, 2, 2, 0};

        System.out.println(countDistinctAbs(arr)); // 3
    }
}
