package Array;

import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập size mảng 1: ");
        int s1=scanner.nextInt();
        int [] a1=new int[s1];
        for (int i=0;i<s1;i++){
            System.out.println("Nhập element: ");
            a1[i]=scanner.nextInt();
        }
        System.out.println("Nhập size mảng 2: ");
        int s2=scanner.nextInt();
        int [] a2=new int[s2];
        for (int i=0;i<s2;i++){
            System.out.println("Nhập element: ");
            a2[i]=scanner.nextInt();
        }
        int [] mergeArray=new int[s1+s2];
        for (int i=0;i<s1;i++){
            mergeArray[i]=a1[i];
        }
        for (int i=0;i<s2;i++){
            mergeArray[s1+i]=a2[i];
        }
        System.out.println("Mảng sau khi gộp: ");
        for (int x:mergeArray){
            System.out.println(x+" ");
        }
        scanner.close();
    }
}
