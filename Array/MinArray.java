package Array;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào size mảng: ");
        int sizeArray=scanner.nextInt();
        int []element=new int[sizeArray];
        for (int i=0;i<sizeArray;i++){
            System.out.println("Nhập element: ");
            element[i]=scanner.nextInt();
        }
        int minValue=element[0];
        for (int i=0;i<sizeArray;i++){
            if (element[i]<minValue){
                minValue=element[i];
            }
        }
        System.out.println("Min = "+minValue);

    }
}
