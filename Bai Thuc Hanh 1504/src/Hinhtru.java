import java.util.Scanner;

public class Hinhtru extends HinhHoc {
    public float chieuCao;

    // Construction
    public Hinhtru() {
        ten = "Hình Trụ";
    
    }
    public void nhapChieuCao () {
        nhapbanKinh();

        System.out.println("Chiều cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
    
}
