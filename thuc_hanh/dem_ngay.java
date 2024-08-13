package ss_1.thuc_hanh;
import java.util.Scanner;
public class dem_ngay {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" NHập tháng bạn muốn đếm:");
        int month= scanner.nextInt();
        switch(month){
            case 2:
                System.out.println("Tháng 2 có 28 ngày hoặc 29 ngày "+month);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("The month '" + month + "' has 30 days!");
                break;
            default:
                System.out.println("lỗi ");
                break;
        }
    }
}
