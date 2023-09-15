import java.util.Scanner;

public class BaiTH5 {
    public static void main(String[] args) {
        double chieuDai, chieuRong,chuVi, dienTich;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài: ");
        chieuDai = scanner.nextDouble();
        System.out.println("nhập chiều rộng: ");
        chieuRong = scanner.nextDouble();


        chuVi = (chieuDai+chieuRong)*2;
        dienTich = chieuDai* chieuRong;
        System.out.println("chu vi: ");
    }
}
