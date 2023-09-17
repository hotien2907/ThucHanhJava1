package BaiTapBuoi1;

import java.util.Scanner;

public class BaiTH5 {
    public static void main(String[] args) {
     double diemToan, diemLy, diemHoa, diemVan,diemTiengAnh;
     String mass;
     double diemTrungBinh;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán: ");
        diemToan = sc.nextDouble();
        System.out.println("nhập điểm lý");
        diemLy =sc.nextDouble();
        System.out.println("nhập điểm hóa");
        diemHoa = sc.nextDouble();
        System.out.println("nhập điểm văn");
        diemVan = sc.nextDouble();
        System.out.println("nhập điểm tiếng anh");
        diemTiengAnh = sc.nextDouble();


        diemTrungBinh = ((diemToan+diemHoa+diemVan+diemTiengAnh+diemHoa+diemLy)/5);
        if(0<=diemTrungBinh&& diemTrungBinh<5) {
            mass = "xếp loa yếu";
        }
        else if(diemTrungBinh<6.5) {
            mass="xếp loại trung bình";
        }else  if(diemTrungBinh<8) {
            mass ="xếp loại khá";

        }else if(diemTrungBinh <9) {
            mass ="xếp lại giỏi";

        }else {
            mass= "Xếp loại xuất sắc";
        }
        System.out.println("kết quả: " + diemTrungBinh+ "=>"+ mass);

    }
}
