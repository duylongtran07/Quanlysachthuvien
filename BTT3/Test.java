import java.util.ArrayList;

// yêu cầu 3: Xây dựng lớp Test để tạo đối tượng từ lớp Sach.
public class Test {
    public static void main(String[] args) {
        Sach sach1=new Sach("001", "Lập trình hướng đối tượng" , "Phan Lợi", 2020, 10);;
        Sach sach2=new Sach("002","Cơ sở dữ liệu","Đức Quang",2021,20);


        //Yêu cầu 4: Tạo và quản lý danh sách Sach bằng ArrayList
        ArrayList<Sach> danhSachsach = new ArrayList<>();
        danhSachsach.add(sach1);
        danhSachsach.add(sach2);
        for(int i=0;i<danhSachsach.size();i++)
        {
            System.out.println("Sách thứ  " +(i+1)+ ":");
            danhSachsach.get(i).hienthiThongtin();
            System.out.println("");

        }

    }
}
