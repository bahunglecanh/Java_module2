package Bai16;

import java.io.*;
import java.util.Scanner;

public class FileCopyProgramBuffered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH SAO CHÉP FILE (BUFFERED) ===");

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String targetFile = scanner.nextLine();

        try {
            copyFileBuffered(sourceFile, targetFile);
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        scanner.close();
    }

    public static void copyFileBuffered(String sourceFile, String targetFile) throws IOException {
        File source = new File(sourceFile);
        File target = new File(targetFile);

        if (!source.exists()) {
            throw new IOException("File nguồn không tồn tại: " + sourceFile);
        }

        if (target.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" File đích đã tồn tại. Bạn có muốn ghi đè? (y/n): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Hủy sao chép file.");
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(target))) {

            String line;
            int lineCount = 0;
            int characterCount = 0;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                lineCount++;
                characterCount += line.length() + 1;
            }

            System.out.println(" Sao chép file thành công!");
            System.out.println(" Số dòng: " + lineCount);
            System.out.println(" Số ký tự: " + characterCount);
            System.out.println(" File nguồn: " + sourceFile);
            System.out.println(" File đích: " + targetFile);
            System.out.println(" Kích thước file: " + source.length() + " bytes");
        }
    }
}
