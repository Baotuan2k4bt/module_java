package ss_1.thuc_hanh;
import java.util.Scanner;
public class pt_bac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập gia trị 'a*x+b=c' : ");
        System.out.println(" Nhập giá trị a:");
        double a = scanner.nextDouble();
        System.out.println(" Nhập giá trị b:");
        double b = scanner.nextDouble();
        System.out.println("NHập giá trị c:");
        double c = scanner.nextDouble();
        double anwser = 0;
        if (a != 0) {
            anwser = (c - b) / a;
            System.out.println("Phương trình có nghiệm x=%f!\n" + anwser);
        } else if (b == c) {
            System.out.println("phương trình nghiêm đúng với moị x!" + anwser);
        } else {
            System.out.println("Vô nghiệm"+anwser);
        }
    }
}
