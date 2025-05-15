package VongLap;

import java.util.Scanner;

public class DisplayGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            // In menu
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (4 angles)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRetangle(sc);
                    break;
                case 2:
                    printSquareTriangle(sc);
                    break;
//                case 3:
//                    printIsoscelesTriangle(sc);
//                    break;
                case 4:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
            System.out.println();
        } while (choice != 4);
        sc.close();
    }
    public static void printRetangle(Scanner scanner){
        System.out.println("Nhập vào chiều cao: ");
        int height=scanner.nextInt();
        System.out.println("Nhập vào chiều rộng: ");
        int width=scanner.nextInt();
        for (int i=0;i<height;i++){
            for (int j=0;j<width;j++){
                System.out.println("* ");
            }
            System.out.println();
        }

    }
    public static void printSquareTriangle(Scanner scanner){
        System.out.print("Enter height of the triangle: ");
        int height = scanner.nextInt();

        System.out.println("\nTop-left right angle:");
        for (int i=height;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nBotton-left: ");
        for(int i=1;i<=height;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
