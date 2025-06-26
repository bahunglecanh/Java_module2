package Bai19.validateclass;

public class ValidateClassName {
    public static boolean isValidClassName(String className) {
        String regex = "^[CAP]\\d{4}[GHIK]$";
        return className.matches(regex);
    }

    public static void main(String[] args) {
        String[] testClasses = {"C0223G", "A0323K", "M0318G", "P0323A", "C1234H", "A9999I", "P0000K", "C123G"};

        for (String className : testClasses) {
            System.out.printf("Tên lớp %-7s hợp lệ? %b%n", className, isValidClassName(className));
        }
    }
}
