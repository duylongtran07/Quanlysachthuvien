import java.util.Scanner;

public class BTT3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // bài tập tuần 3
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


        // bài tập tuần 4
        // bài 1 : Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ
        if(dongia>0 && sl>=0)
            System.out.println("Năm Xuất bản hợp lệ");
        //bài 2:
        if(dongia >200)
            System.out.println("Sách giá đặc biệt");
        else if (dongia>100) {
            System.out.println("Sách giá cao");
        }
        else if(dongia>50)
            System.out.println("Sách giá trung bình");
        else
            System.out.println("Sách giá thấp");
        //bài 3: Phân loại tồn kho: hết, sắp hết, còn ít, còn nhiều. 0 → Hết sách, 1–5 → Sắp hết, 6–20 → Còn ít,
        // >20 → Còn nhiều
        if (sl>20)
            System.out.println("Còn nhiều");
        else if(sl>6)
            System.out.println("Còn ít");
        else if(sl>1)
            System.out.println("Sắp hết");
        else
            System.out.println("hết");
        //bài 4
        System.out.println("Nhập loại sách: ");
        int loaisach=sc.nextInt();
        switch (loaisach)
        {
            case 1:
                System.out.println("Sách giáo khoa"); break;
            case 2:
                System.out.println("Sách tham khảo");break;
            case 3:
                System.out.println("Sách chuyên ngành");break;
            default:
                System.out.println("Sách khác");
        }
    }
}
