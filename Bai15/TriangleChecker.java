package Bai15;

import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
public class TriangleChecker {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Các cạnh phải là số dương!");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhập 3 cạnh tam giác: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            checkTriangle(a, b, c);

            System.out.println(" Tam giác hợp lệ với 3 cạnh: " + a + ", " + b + ", " + c);

        } catch (IllegalTriangleException e) {
            System.out.println(" Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Lỗi nhập liệu!");
        }

        sc.close();
    }
}
