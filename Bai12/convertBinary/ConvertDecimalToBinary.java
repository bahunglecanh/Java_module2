package Bai12.convertBinary;

import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int decimal=55;
        System.out.println("Decimal: "+decimal);
        String binary=Convert(decimal);
        System.out.println("Convert to Binary: "+ binary);
    }
    public static String Convert(int decimal){
        Stack<Integer> stack=new Stack<>();
        while (decimal>0){
            stack.push(decimal % 2);
            decimal=decimal/2;
        }
        StringBuilder stringBuilder=new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return  stringBuilder.toString();
    }
}
