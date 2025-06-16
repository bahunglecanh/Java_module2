package Bai14.insert_step;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertSortStep {
    public static void insertionSort(int[] arr) {
        System.out.println("=== THUẬT TOÁN SẮP XẾP CHÈN ===");
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.printf("Bước %d: Chèn phần tử %d vào vị trí thích hợp\n", i, key);
            System.out.println("Phần đã sắp xếp: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i)));
            System.out.println("Phần tử cần chèn: " + key);

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                System.out.printf("  Di chuyển %d từ vị trí %d sang vị trí %d\n",
                        arr[j], j, j + 1);
                j--;
            }

            arr[j + 1] = key;
            System.out.printf("  Chèn %d vào vị trí %d\n", key, j + 1);
            System.out.println("Kết quả: " + Arrays.toString(arr));
            System.out.println("─".repeat(50));
        }

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số lượng phần tử: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("Số lượng phần tử phải lớn hơn 0");
            }

            int[] arr = new int[n];
            System.out.println("Nhập các phần tử:");

            for (int i = 0; i < n; i++) {
                System.out.printf("Phần tử thứ %d: ", i + 1);
                arr[i] = scanner.nextInt();
            }

            return arr;

        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("Vui lòng nhập số nguyên hợp lệ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("CHƯƠNG TRÌNH MINH HỌA THUẬT TOÁN SẮP XẾP CHÈN");
            System.out.println("=" .repeat(60));

            System.out.println("Chọn cách nhập dữ liệu:");
            System.out.println("1. Nhập thủ công");
            System.out.println("2. Sử dụng mảng mẫu");
            System.out.print("Lựa chọn của bạn: ");

            int choice = scanner.nextInt();
            int[] arr;

            switch (choice) {
                case 1:
                    arr = inputArray();
                    break;
                case 2:
                    arr = new int[]{64, 34, 25, 12, 22, 11, 90};
                    System.out.println("Sử dụng mảng mẫu: " + Arrays.toString(arr));
                    break;
                default:
                    throw new IllegalArgumentException("Lựa chọn không hợp lệ");
            }

            System.out.println();

            insertionSort(arr.clone());

        } catch (Exception e) {
            System.err.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
