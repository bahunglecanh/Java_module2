import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double vnd=23000;
        double usd;
        System.out.println("Enter USD: ");
        usd=scanner.nextDouble();
        double quyDoi=usd*23000;
        System.out.println("Giá trị VND là: "+quyDoi);
    }
}
