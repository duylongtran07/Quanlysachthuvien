
// yêu cầu 1 :Tất cả các thuộc tính của lớp Sach
// (ví dụ: maSach, tieuDe, tacGia, namXuatBan, soLuong) phải được khai báo với từ khóa private.
public class Sach {

    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

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


    //    Yêu cầu 4: Thêm một constructor có tham số đầy đủ vào lớp Sach, cho phép
//khởi tạo tất cả các thuộc tính (maSach, tieuDe, tacGia, namXuatBan, soLuong) khi
//tạo một đối tượng Sach.
    public Sach(String ms, String td, String tg, int nxb, int sl)
    {
        this.maSach=ms;
        this.tieuDe=td;
        this.tacGia=tg;
        this.namXuatBan=nxb;
        this.soLuong=sl;
    }
    //Cung cấp đầy đủ các phương thức public getters (phương thức truy cập) và
    // setters (phương thức sửa đổi) cho tất cả các thuộc tính của lớp Sach.
    public Sach()
    {
    }

    public String getMaSach()
    {
        return maSach;
    }
    public void setMaSach(String ms)
    {
        this.maSach=ms;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if(namXuatBan >0 && namXuatBan<=2026)
            this.namXuatBan = namXuatBan;
        else
            System.out.println("năm xuất bản không hợp lệ");
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong>=0)
            this.soLuong = soLuong;
        else
            System.out.println("Số lượng không hợp lệ");
    }


}






