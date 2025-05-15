import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number=scanner.nextInt();

        if(number< 0 ||number>999){
            System.out.println(number+" out of ability");
        }else {
            System.out.println("Cách đọc: "+convertNumberToWords(number));
        }
    }
    public static String convertNumberToWords(int num){
        if (num<10){
            return getLessTen(num);
        } else if (num<20) {
            return getTeens(num);
        } else if (num<100) {
            return getNumberTens(num/10)+(num%10!=0 ? " "+getLessTen(num%10):" ");
        }else {
            int hundreds = num / 100;
            int remainder = num % 100;

            String result = getLessTen(hundreds) + " hundred";

            if (remainder != 0) {
                result += " and " + convertNumberToWords(remainder);
            }

            return result;
        }
    }
    public static String getLessTen(int num){
        switch (num){
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String getTeens(int num){
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    public static String getNumberTens(int num){
        switch (num) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
