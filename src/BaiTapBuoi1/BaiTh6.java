package BaiTapBuoi1;

import java.util.Scanner;

public class BaiTh6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số muốn check có chia hết cho 3 hay 5 ko");

        String mess;
        int number = sc.nextInt();

        if (number % 3 == 0) {
            if (number % 5 == 0) {
                mess = "chia hết cho cả 3 và 5";
            } else {
                mess = "chỉ chia hết cho 3";
            }

        } else if (number % 5 == 0) {
            mess = "chỉ chia hết cho 5";
        } else {
            mess = "không chia hết cho cả 3 và 5";
        }

        System.out.println(mess);
    }
}
