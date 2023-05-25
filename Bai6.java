import java.util.*;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;

    public SinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, SinhVien> danhSachSV = new HashMap<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSV = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop);
            danhSachSV.put(maSV, sinhVien);
        }

        System.out.print("Nhap ten lop: ");
        String tenLop = scanner.nextLine();
        System.out.println("Danh sach sinh vien thuoc lop " + tenLop + ":");
        for (SinhVien sinhVien : danhSachSV.values()) {
            if (sinhVien.getLop().equals(tenLop)) {
                System.out.println("Ma Sinh Vien: " + sinhVien.getMaSV());
                System.out.println("Ho va ten: " + sinhVien.getHoTen());
                System.out.println("Lop: " + sinhVien.getLop());
                System.out.println("---------------------");
            }
        }

        System.out.print("Nhap ma sinh vien: ");
        String maSVDaNhap = scanner.nextLine();
        SinhVien sinhVienDaNhap = danhSachSV.get(maSVDaNhap);
        if (sinhVienDaNhap != null) {
            System.out.println("Thong tin sinh vien voi ma sinh vien " + maSVDaNhap + ":");
            System.out.println("Ho va ten: " + sinhVienDaNhap.getHoTen());
            System.out.println("Lop: " + sinhVienDaNhap.getLop());
        } else {
            System.out.println("Khong tim thay thong tin sinh vien " + maSVDaNhap);
        }
    }
}
