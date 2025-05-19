package Class_Object.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b =scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c=scanner.nextDouble();
         QuadraticEquation equation=new QuadraticEquation(a,b,c);
         double delta=equation.getDiscriminant();
         if (delta>0){
             System.out.println("Root1: "+equation.getRoot1());
             System.out.println("Root2: "+equation.getRoot2());
         } else if (delta==0) {
             double root=-b/(2*a);
             System.out.println("Root: "+root);
         }else {
             System.out.println("The equation has no roots");
         }
    }
}
