package Bai12.stack;

import java.util.Stack;

public class DaoNguocSoNguyen {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng trước khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reserveInteger(arr);

        System.out.println("\nMảng sau khi đảo ngược:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    public static void reserveInteger(int[] arr){
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
    }
}
