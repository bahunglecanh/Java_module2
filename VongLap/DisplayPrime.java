package VongLap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=20;
        int count=0;
        int n=2;
        while (count<number){
            if (isPrime(n)){
                System.out.print(n+" ");
                count++;
            }
            n++;
        }
        scanner.close();

    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) return false;
        }
        return true;
    }
}
