package Array;

import java.util.Scanner;

public class SumTwoArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        int row=scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        int cols=scanner.nextInt();

        double [][] matrix=new double[row][cols];
        for (int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                System.out.printf("Matrix [%d][%d] = ",i,j);
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.print("Bạn muốn tính tổng cột nào (0–" + (cols - 1) + ")? ");
        int colIndex = scanner.nextInt();
        double sum=0;
        for (int i=0;i<row;i++){
            sum+=matrix[i][colIndex];
        }
        System.out.println("Tổng element là: "+sum);
    }
}
