package Bai19.validatephone;

public class ValidatePhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        // Một số ví dụ kiểm thử
        String[] testNumbers = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(12)-(0123456789)",
                "(00)-(0123456789)",
                "(99)-(012345678)",
                "(84)-(01234567890)"
        };

        for (String number : testNumbers) {
            System.out.printf("Số điện thoại %-18s hợp lệ? %b%n", number, isValidPhoneNumber(number));
        }
    }
}
