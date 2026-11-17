import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int value : values) {
            array.add(value);
        }
        System.out.println(array);
        List reversed = reversed(array);
        System.out.println(reversed);
    }

    static List reversed(ArrayList<Integer> array) {
        return array.reversed();
    }
}
