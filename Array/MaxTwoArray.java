package Array;

import java.util.Scanner;

public class MaxTwoArray {
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
        double maxValue=matrix[0][0];
        int maxRow=0, maxCol=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<cols;j++){
                if (matrix[i][j]>maxValue){
                    maxValue=matrix[i][j];
                    maxRow=i;
                    maxCol=j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất nằm ở dòng "
                + maxRow + ", cột " + maxCol
                + " có giá trị " + maxValue);
    }
}
