public class LinearSearch {
    public static void main(String[] args) {
        Object[] list1 = {1, 2, 3, 4, 5, 6};
        Object target1 = 7;
        int index1 = linearSearch(list1, target1);
        System.out.println(index1 != -1 ? "Found at index " + index1 : "Target not found");

        Object[] list2 = {"Javascript", "Python", "Dart", "Java", "C++"};
        Object target2 = "Python";
        int index2 = linearSearch(list2, target2);
        System.out.println(index2 != -1 ? "Found at index " + index2 : "Target not found");
    }

    static int linearSearch(Object[] list, Object target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
