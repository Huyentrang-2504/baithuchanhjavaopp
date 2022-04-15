import java.util.Scanner;

public class Hinhchunhat extends HinhHoc {

        public float dai;
        public float rong;
        public Hinhchunhat() {
            ten = "Hình chữ nhật";
        }
        
        public void nhapchieudai() {
            System.out.println("chieu dai = ");
            Scanner scanner = new Scanner(System.in);
            dai = scanner.nextFloat();
        }

        public void tinhchuvi() {
            chuVi = 2 * (dai+rong);
        }

        public void tinhdientich() {
            dienTich = dai * rong;
        }

        public void nhapchieurong() {
        }

        public void indientich() {
        }
}   
