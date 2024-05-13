package aptech.day7.example3;

public class MainDay7 {
    public static void main(String[] args) {
        // hình vuông
        TinhChuVi tinhChuViHinhVuong = new TinhChuViHinhVuong();
        double resultHV = tinhChuViHinhVuong.tinhToan();
        System.out.println("Chu vi hình vuông là: " + resultHV);

        // hình chữ nhật
        TinhChuVi tinhChuViHinhChuNhat = new TinhChuViHinhChuNhat();
        double resultHCN = tinhChuViHinhChuNhat.tinhToan();
        System.out.println("Chu vi hình chữ nhật là: " + resultHCN);

        // hình tròn
        TinhChuVi tinhChuViHinhTron = new TinhChuViHinhTron();
        double resultHT = tinhChuViHinhTron.tinhToan();
        System.out.println("Chu vi hình tròn là: " + resultHT);

        // hình tam giác
        TinhChuVi tinhChuViHinhTamGiac = new TinhChuViHinhTamGiac();
        double resultHTG = tinhChuViHinhTamGiac.tinhToan();
        System.out.println("Chu vi hình tam giác là: " + resultHTG);
    }
}
