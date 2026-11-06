import java.util.ArrayList;
import java.util.Scanner;

public class BTT5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int menu;
        int tongsl=0;
        float tongtien=0;
        int sl;
        String masach="";
        String tensach="";
        float giasach;
        do {
            System.out.println("Menu");
            System.out.println("1.Nhập sách " );
            System.out.println("2.Tính tổng số lượng sách :");
            System.out.println("3.Tính tổng giá trị sách");
            System.out.println("4.thoát menu:");
            System.out.println("5.Tìm sách theo mã: ");

            System.out.print("Nhập lựa chọn: ");
            menu = Integer.parseInt(sc.nextLine());

            switch(menu)
            {
                case 1:
                {

                    int i;
                    System.out.print("Nhap so luong sach: " );
                    int n = Integer.parseInt(sc.nextLine());
                    for(i=1;i<=n;i++)
                    {
                        System.out.println("nhập sách thứ " +i);
                        System.out.print("Nhập mã sách: ");
                        masach=sc.nextLine();
                        System.out.print("Nhập tên sách: ");
                        tensach=sc.nextLine();
                        System.out.print("Nhập giá sách: ");
                        giasach=Float.parseFloat(sc.nextLine());
                        System.out.print("nhập số lượng sách: ");
                        sl=Integer.parseInt(sc.nextLine());
                        tongsl=tongsl+sl;
                        tongtien=sl*giasach+tongtien;
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Tổng số lượng sách: " +tongsl);

                }
                break;
                case 3:
                {
                    System.out.println("Tổng tiền " +tongtien);
                    break;
                }

                case 4 :
                {
                    System.out.println("thoát menu");
                    break;
                }
                case 5:
                {
                    {
                        System.out.print("Nhập mã sách cần tìm: ");
                        String maTim = sc.nextLine();

                        if (masach != null && masach.equalsIgnoreCase(maTim)) {
                            System.out.println("Đã tìm thấy sách!");
                            System.out.println("Mã sách: " + masach);
                            System.out.println("tên sách: " +tensach);
                        } else {
                            System.out.println("Không tìm thấy mã sách: " + maTim);

                        }
                        break;
                    }
                }
            }
        }while (menu!=4);

        // bài tập tuần 6: mảng
        // bài 1: Tạo mảng: int[] soLuong; cho phép nhập số
        // cho phép nhập số lượng của 5 cuốn sách. Sau đó: Hiển thị số lượng, tính tổng, tìm số lượng lớn nhất.
        int []soluong=new int[5];
        int i;
        System.out.println("Nhập số lượng cho 5 cuốn sách");
        // nhập số lượng sách
        for( i=0;i<soluong.length;i++) {
            System.out.println("số lượng sách thứ " + (i+1) + "là: ");
            soluong[i] = sc.nextInt();
        }
        // hiển thị số lượng
        for(i=0;i<soluong.length;i++)
            System.out.println("số lượng sách thứ "+(i+1)+ " là " +soluong[i]);
        // hiển thị tổng số lượng
        for(i=1;i<soluong.length;i++)
            tongsl+=soluong[i];
        // Tìm số lượng lớn nhất
        int max=soluong[1];
        for(i=1;i<soluong.length;i++)
        {
            max=soluong[i];
            if(soluong[i]>max)
                max=soluong[i];
        }
        System.out.println("Số lượng lớn nhất là: " +max);
        //Bài 2:
        ArrayList<String> dsMa = new ArrayList<>();
        // thêm sách
        System.out.print("Nhập số lượng mã sách: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(i=0;i<n;i++)
        {
            System.out.print("Nhập mã sách thứ " +(i+1)+ ":");
            dsMa.add(sc.nextLine());
        }
        // Hiển thị sách
        System.out.println("Danh sách mã sách : ");
        for(i=0;i<n;i++)
            System.out.println("Mã sách thứ "+(i+1)+ ": " +dsMa.get(i));
        //Tìm sách
        System.out.print("Nhập mã sách cần tìm: ");
        String mact;
        mact=sc.nextLine();
        boolean timthay=false;
        for(i=0;i<n;i++)
            if(mact.equals(dsMa.get(i)))
            {
                System.out.println("Tìm thấy mã sách :" +mact);
                timthay=true;
                break;
            }
        if(timthay == false)
            System.out.println("Không tìm thấy mã sách :" +mact);
        //xoá mã sách
        System.out.print("Nhập mã sách cần xoá: ");
        String macx;
        macx=sc.nextLine();
        if(dsMa.remove(macx))
            System.out.println("xoá thành công");
        else
            System.out.println("Không tìm thấy mã để xoá");


        //bài 3:
        ArrayList <String> danhsachsach = new ArrayList<>();
        // Thêm sách
        int slsach;
        System.out.println("số lượng sách : " );
        slsach=sc.nextInt();
        sc.nextLine();
        for(i=0;i<slsach;i++)
        {
            System.out.println("Nhập thông tin cho cuốn sách thứ " +(i+1)+": ");
            String tts;
            tts=sc.nextLine();
            danhsachsach.add(tts);
        }
        // Hiển thị sách
        System.out.println("Danh sách thông tin sách là : ");
        for(i=0;i<danhsachsach.size();i++)
            System.out.println("sách thứ: " +(i+1)+ ": " +danhsachsach.get(i));
        //Tìm sách
        System.out.println("Nhập từ khoá của sách: ");
        String tukhoa;
        tukhoa= sc.nextLine();
        for(i=0;i<danhsachsach.size();i++)
            if(danhsachsach.get(i).contains(tukhoa))
            {
                System.out.println("Tìm thấy sách");
                timthay=true;
            }
        if(!timthay)
            System.out.println("không tìm thấy sách ");
        //Sửa sách
        System.out.println("Nhập vị trí cần sửa sách");
        int vtsua=sc.nextInt();
        sc.nextLine();
        if(vtsua >=0 && vtsua < danhsachsach.size())
        {
            System.out.println("nhập lại thông tin");
            String ttm;
            ttm=sc.nextLine();
            danhsachsach.set(vtsua,ttm);
            System.out.println("Sửa thành công");
        }
        else
            System.out.println("Vị trí không hợp lệ");
        //xoá xách
        System.out.println("Nhập vị trí cần xoá : ");
        int vtxoa;
        vtxoa= sc.nextInt() - 1;
        if(vtxoa >=0 && vtxoa < danhsachsach.size())
        {
            danhsachsach.remove(vtxoa);
            System.out.println("xoá thành công");
        }
        else
            System.out.println("vị trí không hợp lệ để xoá ");



        //bài Tập 4
        danhsachsach.clear(); // xoá dữ liệu ở mảng cũ
        ArrayList<Double> dsGia = new ArrayList<>();
        int j;
        do{
            System.out.println("\n--- MENU QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.println("Nhập lựa chọn");
            menu=sc.nextInt();
            sc.nextLine();
            switch(menu)
            {
                //thêm sách
                case 1:
                    System.out.print("Nhập số lượng sách cần thêm: ");
                    int slThem = sc.nextInt();
                    sc.nextLine();
                    for (j = 0; j < slThem; j++) {
                        System.out.print("Nhập thông tin cho cuốn sách thứ " + (j + 1) + ": ");
                        String tts = sc.nextLine();
                        danhsachsach.add(tts);
                        //nhập giá tiền để tính cho case 7
                        System.out.print("Nhập giá tiền của cuốn này: ");
                        double gia = sc.nextDouble();
                        sc.nextLine(); // Xóa bộ nhớ đệm
                        dsGia.add(gia);
                    }
                    System.out.println("-> Thêm sách thành công!");
                    break;
                // Hiển thị sách
                case 2:
                    System.out.println("Danh sách thông tin sách là: ");
                    if (danhsachsach.isEmpty()) {
                        System.out.println("Danh sách đang trống!");
                    } else {
                        for (j = 0; j < danhsachsach.size(); j++) {
                            System.out.println("Sách thứ " + (j + 1) + ": " + danhsachsach.get(j));
                        }
                    }
                    break;
                // Tìm sách
                case 3:
                    System.out.print("Nhập từ khoá của sách cần tìm: ");
                    String tukhoaMenu = sc.nextLine();
                    boolean timthayMenu = false;
                    for (j = 0; j < danhsachsach.size(); j++) {
                        if (danhsachsach.get(j).contains(tukhoaMenu)) {
                            System.out.println("-> Tìm thấy tại vị trí số " + (j + 1) + ": " + danhsachsach.get(j));
                            timthayMenu = true;
                        }
                    }
                    if (!timthayMenu) {
                        System.out.println("-> Không tìm thấy sách phù hợp!");
                    }
                    break;
                // Xóa sách theo vị trí
                case 4:
                    System.out.print("Nhập vị trí sách cần xóa (từ 1 đến " + danhsachsach.size() + "): ");
                    int vtXoaMenu = sc.nextInt() - 1; // Trừ 1 để về đúng index của ArrayList
                    sc.nextLine();
                    if (vtXoaMenu >= 0 && vtXoaMenu < danhsachsach.size()) {
                        danhsachsach.remove(vtXoaMenu);
                        System.out.println("-> Xóa thành công!");
                    } else {
                        System.out.println("-> Vị trí không hợp lệ để xóa!");
                    }
                    break;
                // Sửa sách theo vị trí
                case 5:
                    System.out.print("Nhập vị trí cần sửa sách (từ 1 đến " + danhsachsach.size() + "): ");
                    int vtSuaMenu = sc.nextInt() - 1;
                    sc.nextLine();
                    if (vtSuaMenu >= 0 && vtSuaMenu < danhsachsach.size()) {
                        System.out.print("Nhập lại thông tin mới: ");
                        String ttmMenu = sc.nextLine();
                        danhsachsach.set(vtSuaMenu, ttmMenu);
                        System.out.println("-> Sửa thành công!");
                    } else {
                        System.out.println("-> Vị trí không hợp lệ!");
                    }
                    break;
                // Tính tổng số lượng (lấy từ mảng soluong ở Bài 1)
                case 6:
                    int tongslMenu = 0;
                    for (j = 0; j < soluong.length; j++) {
                        tongslMenu += soluong[j];
                    }
                    System.out.println("-> Tổng số lượng sách trong mảng cố định: " + tongslMenu);
                    break;
                // Tính tổng giá trị
                case 7:
                    double tongGiaTri = 0;
                    if (dsGia.isEmpty())
                    {
                        System.out.println("-> Chưa có dữ liệu giá tiền trong kho!");
                    }
                    else
                    {
                        for (j = 0; j < dsGia.size(); j++) {
                            tongGiaTri += dsGia.get(j); // Cộng dồn giá tiền các cuốn sách
                        }
                        System.out.println("-> Tổng giá trị tất cả sách trong kho là: " + tongGiaTri);
                    }
                    break;

                case 8:
                    System.out.println("Thoát chương trình. ");
                    break;
            }
        }while(menu!=8);

    }
}

