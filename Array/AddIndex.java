package Array;

import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array={10,4,6,7,8,6,0,0,0,0};
        int n=array.length;
        System.out.println("Mảng ban đầu: ");
        printArray(array,n);
        System.out.print("Nhập giá trị cần chèn X: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí index cần chèn: ");
        int index = scanner.nextInt();
        if (index<0 ||index > n-1){
            System.out.println("Vị trí không hợp lệ");
        }else {
            for (int i=n-1;i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=x;
            System.out.println("Mảng sau khi đã chèn: ");
            printArray(array,n);
        }
    }
    public static void printArray(int arr[],int num){
        for (int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
