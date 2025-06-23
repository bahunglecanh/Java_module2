package Bai14.insert;


public class InsertSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Trước: " + java.util.Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sau: " + java.util.Arrays.toString(arr));
    }
}
