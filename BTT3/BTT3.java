import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //bài 1
        System.out.println("Nhập mã sách");
        String masach=sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String tensach=sc.nextLine();
        System.out.println("Năm Suất bản");
        int nxb=sc.nextInt();
        System.out.println("Nhập đơn giá");
        float dongia=sc.nextFloat();
        System.out.println("Nhập số lượng");
        int sl=sc.nextInt();
        System.out.println("Nhập mã sách: " +masach);
        System.out.println("Nhập tên sách: " +tensach);
        System.out.println("Năm Suất bản: " +nxb);
        System.out.println("Nhập đơn giá: " +dongia);
        System.out.println("Nhập số lượng: " +sl);
        //bài 2
        double tt= (double) dongia * sl;
        System.out.println("Thành tiền: " +tt);
        //bài 3
        double pvc=(double) 0.05 * dongia;
        System.out.println("Phí vận chuyển: " +pvc);
        //bài 4
        double tongien= tt+pvc;
        System.out.println("Tổng tiền : " +tongien);
    }
}
