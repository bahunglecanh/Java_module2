package Bai13.chuoiTangDan;

import java.util.Scanner;

public class MostLength {
    public static String findSubStringLongest(String input){
        String currentString="";
        String longestString="";
        if (input==null || input.length()==0){
            return "";
        }
        for (int i = 0; i < input.length(); i++) {
            currentString=String.valueOf(input.charAt(i));
            for (int j=i+1;j<input.length()-1;j++){
                if (input.charAt(j)>currentString.charAt(currentString.length()-1)){
                    currentString+=input.charAt(j);
                }
            }
            if (currentString.length()>longestString.length()){
                longestString=currentString;
            }
        }
        return longestString;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String input=scanner.nextLine();
        String result=findSubStringLongest(input);
        System.out.println("Chuỗi gốc: "+input);
        System.out.println("Chuỗi sau khi tìm: "+result);
        System.out.println("Độ dài: "+result.length());
    }
}
