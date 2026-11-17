public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 10, 19, 22, 24, 30, 35, 36, 40};
        int target = 36;
        int index = binarySearch(numbers, target);
        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return -1;
    }
}
