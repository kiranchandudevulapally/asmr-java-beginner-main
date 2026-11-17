public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int[] reversed = reverse(numbers);
        for (int number : reversed) {
            System.out.print(number + " ");
        }
    }
    static int[] reverse(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        int temp;
        while (start < end) {
            temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        return numbers;
    }
}
