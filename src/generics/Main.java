package generics;

/**
 * @author : Gathsara
 * created : 2/19/2026 -- 8:36 PM
 **/

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        String[] arr2 = {"Hello", "World"};
        printArray(arr1);
        printArray(arr2);
    }

    private static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }
}
