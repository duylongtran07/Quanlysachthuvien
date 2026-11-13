import java.util.ArrayList;

// yêu cầu 1
public class Sach {

    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;

    // yêu cầu 2 :Tạo một phương thức hienThiThongTin() (displayInfo) trong lớp Sach để in ra tất cả
// thông tin chi tiết của một cuốn sách ra màn hìnhTạo một phương thức hienThiThongTin() (displayInfo)
// trong lớp Sach để in ra tất cả thông tin chi tiết của một cuốn sách ra màn hình
    public void hienthiThongtin()
    {
        System.out.println("Mã sách: " +maSach);
        System.out.println("Tiêu đề: "+tieuDe);
        System.out.println("Tác giả: "+tacGia);
        System.out.println("Năm xuất bản: " +namXuatBan);
        System.out.println("Số lượng: " +soLuong);
    }

    public Sach(String ms, String td, String tg, int nxb, int sl)
    {
        this.maSach=ms;
        this.tieuDe=td;
        this.tacGia=tg;
        this.namXuatBan=nxb;
        this.soLuong=sl;
    }
}






