package ss_1.thuc_hanh;
import java.util.Scanner;
public class kt_namnhuan {
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" NHập năm kiểm tra :");
        int year=scanner.nextInt();
        if(year %4==0){
            if(year %400==0){
                if(year %100==0){
                    System.out.println("là năm nhuận "+year);
                }else {
                    System.out.println(" không phải năm nhuận " + year);
                } }else{
                    System.out.println("là năm nhuận"+year);
                }

            }
        else{
            System.out.println("ko là năm nhuận "+year);
        }
        }

}

