package Bai17.copy_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyFileBinary {
    private static final String FILE_NAME = "Bai17/copy_nhi_phan/products.txt";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String sourcePath = FILE_NAME;

        System.out.print("Nhập đường dẫn file đích: ");
        String targetPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        if (!sourceFile.exists()) {
            System.out.println("File nguồn không tồn tại!");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("File đích đã tồn tại! Vui lòng chọn tên khác.");
            return;
        }

        // Thực hiện sao chép file
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytes = 0;

            while ((bytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công! Số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Lỗi trong quá trình sao chép file: " + e.getMessage());
        }
    }
}
