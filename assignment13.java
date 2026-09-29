public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element exists");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};

        System.out.println(findSecondLargest(arr));
    }
}
