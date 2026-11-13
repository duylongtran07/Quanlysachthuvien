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
        for(int i=0;i<danhSachsach.size();i++) {
            System.out.println("Sách thứ  " + (i + 1) + ":");
            danhSachsach.get(i).hienthiThongtin();
            System.out.println("");
        }
//
//        }
//        Yêu cầu 3:
//        Trong setNamXuatBan(int namXuatBan): Đảm bảo namXuatBan
//        không lớn hơn năm hiện tại hoặc nhỏ hơn một giá trị hợp lý nào đó (ví dụ: if
//        (namXuatBan > 0 && namXuatBan <= currentYear)).
//        Trong setSoLuong(int soLuong): Đảm bảo soLuong không âm (if
//        (soLuong >= 0)).
        Sach sach3=new Sach();
        sach3.setMaSach("003");
        sach3.setTieuDe("Mạng máy tính");
        sach3.setTacGia("Minh Phát");
        sach3.setNamXuatBan(2025);
        sach3.setSoLuong(10);
        sach3.hienthiThongtin();


        System.out.println("");
        // yêu cầu 4
        Sach sach4=new Sach("004","Nhập môn ngành","Nguyễn Đức Quang",2019,50);
        sach4.hienthiThongtin();
    }
}
