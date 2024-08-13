package ss_1.bai_tap;
import java.util.Scanner;
public class tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd=23000;
        System.out.println("Nhập số tiền USD :");
         double usd=scanner.nextDouble();
         double quydoi=usd*23000;
        System.out.println("số tiền quy đổi là :"+quydoi+"VND ");
    }
}
