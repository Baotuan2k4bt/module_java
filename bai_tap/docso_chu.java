package ss_1.bai_tap;
import java.text.DecimalFormat;
public class docso_chu {




        private static final String[] units = {
                "", "một", "hai", "ba", "bốn", "năm",
                "sáu", "bảy", "tám", "chín", "mười"
        };

        private static final String[] teens = {
                "mười", "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm",
                "mười sáu", "mười bảy", "mười tám", "mười chín"
        };

        private static final String[] tens = {
                "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi",
                "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
        };

        public static String convert(int number) {
            if (number == 0) {
                return "không";
            }
            if (number < 0) {
                return "âm " + convert(-number);
            }

            String words = "";

            if (number >= 100) {
                words += units[number / 100] + " trăm ";
                number %= 100;
            }

            if (number >= 20) {
                words += tens[number / 10] + " ";
                number %= 10;
            } else if (number >= 10) {
                words += teens[number - 10] + " ";
                return words.trim();
            }

            if (number > 0) {
                words += units[number] + " ";
            }

            return words.trim();
        }

        public static void main(String[] args) {
            int number = 123; // Thay đổi số ở đây
            String result = convert(number);
            System.out.println("Số " + number + " đọc thành chữ là: " + result);
        }
    }

