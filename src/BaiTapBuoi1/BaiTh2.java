package BaiTapBuoi1;

import java.util.Scanner;

public class BaiTh2 {
    public static void main(String[] args) {
        // bước 1: khai báo biến tỉ giá
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị tiền USD:");
        double usdValue = scanner.nextDouble();
        //tính giá trị VND và hiển thị
        double vndValue = usdValue*rate;

        System.out.println("Giá trị tương ứng trong VND"+ vndValue);
    }
}
