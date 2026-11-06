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

                        // Kiểm tra xem đã nhập sách chưa (tránh lỗi null) và so sánh
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
    }
}

