package aptech.day4;

import java.util.ArrayList;

public class MainDay4 {
    public static void main(String[] args) {
        // Tạo ra một array list Student dùng để chứa danh sách sinh viên.
        ArrayList<Student> danhSachSinhVien = new ArrayList<>();
        // Tạo ra đối tượng cụ thể của lớp Student.
        Student st1 = new Student(29, "Tin", "Dut");
        // Đưa đối tượng vào danh sách
        danhSachSinhVien.add(st1);
        Student st2 = new Student(5, "Hoa", "Mai");
        danhSachSinhVien.add(st2);
        Student st3 = new Student(31, "Vu", "Dung");
        danhSachSinhVien.add(st3);
        Student st4 = new Student(19, "Nguyen", "Dung");
        danhSachSinhVien.add(st4);
        Student st5 = new Student(15, "Tran", "Huy");
        danhSachSinhVien.add(st5);

        // Tạo biến để lưu index của phần tử tìm được.
        int searchIndex = -1;
        // Tạo biến lưu từ khóa tìm kiếm.
        long searchKey = 15; // Tìm sinh viên có id = 15;

//        // lấy ra size
//        System.out.println(danhSachSinhVien.size());
//        // xóa đi phần tử tại index thứ 2.
//        danhSachSinhVien.remove(2);
//        // in ra size lần nữa
//        System.out.println(danhSachSinhVien.size());

        // foreach, duyệt qua các phần tử của list.
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            // lây ra phần tử tại index thứ i.
            Student student = danhSachSinhVien.get(i);
            // so sánh nếu trùng từ khóa
            if(student.getId() == searchKey) {
                searchIndex = i;
                System.out.println(searchIndex);
            }
            // gán giá trị ra biến name và in ra.
//            System.out.printf("Student: %d - %s %s\n", student.getId(), student.getLastname(), student.getFirstname());
        }

        if(searchIndex == -1) {
            System.out.println("Không tìm thấy sinh viên");
        }else {
            danhSachSinhVien.remove(searchIndex);
            System.out.println("Xóa thành công sinh viên");
        }
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            Student student = danhSachSinhVien.get(i);
            System.out.printf("Student: %d - %s %s\n", student.getId(), student.getLastname(), student.getFirstname());
        }
    }
}
