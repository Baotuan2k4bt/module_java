package ss_1.thuc_hanh;
import java.util.Scanner;
public class tinh_cannang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số cân nặng 'kg':");
        double weight = scanner.nextDouble();
        System.out.println("NHập chỉ số chiều cao:");
        double height = scanner.nextDouble();
        double bmi = weight /Math.pow(height,2);
        System.out.println(" chỉ số BMI được phân loại như sau:%.2f%n --" + bmi);
        if (bmi < 18.5) {
            System.out.printf("%.2f: Gầy còm%n", bmi);
        } else if (bmi < 25.0) {
            System.out.printf("%.2f: Bình thường%n", bmi);
        } else if (bmi < 30.0) {
            System.out.printf("%.2f: Thừa cân%n", bmi);
        } else {
            System.out.printf("%.2f: Béo phì%n", bmi);
        }

    }
}