package Array;

import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array={10,4,6,7,8,6,0,0,0,0};
        int n=array.length;
        System.out.println("Mảng ban đầu: ");
        printArray(array,n);
        System.out.println("Enter your number need remove: ");
        int x=scanner.nextInt();
        int flag=-1;
        for(int i=0;i<n;i++){
            if (array[i]==x){
                flag=i;
                break;
            }
        }
        if (flag==-1){
            System.out.println("Không tìm thấy trong mảng");
        }else {
            for (int i=flag;i<n-1;i++){
                array[i]=array[i+1];
            }
            n--;
            System.out.println("Mảng sau khi đã xóa phần tử: ");
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
