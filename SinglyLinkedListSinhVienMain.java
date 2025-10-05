
import java.util.Scanner;

public class SinglyLinkedListSinhVienMain {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedListSinhVienDS list = new SinglyLinkedListSinhVienDS();
        int luaChon =0;

        do {
            System.out.println("-----------------MENU----------------");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Kiểm tra danh sách có rỗng không");
            System.out.println("4. Tìm kiếm sinh viên theo id");
            System.out.println("5. Xóa sinh viên theo id");
            System.out.println("6. Sửa sinh viên theo id");
            System.out.println("0. Thoất");
            System.out.print("Mời chọn: ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nhập mã sinh viên: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập họ và tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.print("Nhập điểm trung bình: ");
                    double gpa = sc.nextDouble();
                    SinglyLinkedListSinhVien sv = new SinglyLinkedListSinhVien(id, name, age, gpa);
                    list.addStudent(sv);
                    break;
                case 2:
                    list.printList();
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        System.out.println("Danh sách không rỗng");
                    }
                    break;
                case 4:
                    System.out.print("Nhập id sinh viên cần tiền kếm: ");
                    sc.nextLine();
                    String idTim = sc.nextLine();
                    SinglyLinkedListSinhVien svTim = new SinglyLinkedListSinhVien(idTim);
                    System.out.println(list.findStudentById(svTim));
                    break;
                case 5:
                    System.out.print("Nhập id sinh viên cần xóa: ");
                    sc.nextLine();
                    String idXoa = sc.nextLine();
                    SinglyLinkedListSinhVien svXoa = new SinglyLinkedListSinhVien(idXoa);
                    System.out.println(list.removeStudent(svXoa));
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Nhập id sinh viên cần sửa: ");
                    String idUpdate = sc.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = sc.nextLine();
                    System.out.print("Nhập tuổi mới: ");
                    int newAge = sc.nextInt();
                    System.out.print("Nhập GPA mới: ");
                    double newGpa = sc.nextDouble();
                    boolean updated = list.updateStudent(idUpdate, newName, newAge, newGpa);
                    if (updated) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy sinh viên để sửa.");
                    }
                    break;
            }
        } while (luaChon != 0);
    }
}
