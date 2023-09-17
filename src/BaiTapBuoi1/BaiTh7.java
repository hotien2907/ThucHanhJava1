package BaiTapBuoi1;

import java.util.Scanner;

public class BaiTh7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("nhập số cần đọc vào ");
            int number = sc.nextInt();
            String mess = "";

            if (0 <= number && number <= 9) {
                switch (number) {
                    case 0:
                        mess = "số Không";
                        break;
                    case 1:
                        mess = "số một";
                        break;
                    case 2:
                        mess = "số hai";
                        break;
                    case 3:
                        mess = "số ba";
                        break;
                    case 4:
                        mess = "số bốn";
                        break;
                    case 5:
                        mess = "số năm";
                        break;
                    case 6:
                        mess = "số sáu";
                        break;
                    case 7:
                        mess = "số bảy";
                        break;
                    case 8:
                        mess = "số tám";
                        break;
                    case 9:
                        mess = "số chín";
                        break;
                    default:
                        break;
                }

            } else {
                System.out.println("số nhập vào không hợp lệ");
            }
            System.out.println(number + " đọc là -> " + mess);
        }
    }
}
