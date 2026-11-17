public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 8, 7, 3, 6, 0, 9, 1, 2};
        int[] sorted = bubbleSort(numbers);
        for (int number : sorted) {
            System.out.print(number + " ");
        }
    }

    static int[] bubbleSort(int[] numbers) {
        int len = numbers.length;
        int temp;
        for (int i = 0; i < len; i++) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {  // numbers[j + 1] > numbers[j]
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return numbers;
    }
}
