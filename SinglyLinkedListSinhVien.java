//Tái sử dụng BaiTapSinglyLinkedListNode và BaiTapSinglyLinkedList

import java.util.Objects;

public class SinglyLinkedListSinhVien {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public SinglyLinkedListSinhVien() {
        
    }

    //Constructor nhận id
    public SinglyLinkedListSinhVien(String id) {
        this.id = id;
    }
    public SinglyLinkedListSinhVien(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Thông tin sinh viên: \n"+ "ID: " + id + ", Name: " + name + ", Age: " + age + ", GPA: " + gpa + "\n";
    }


    public int compareTo(SinglyLinkedListSinhVien o) {
        return this.id.compareTo(o.id);
    }
    @Override
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    SinglyLinkedListSinhVien that = (SinglyLinkedListSinhVien) obj;
    return id != null && id.equals(that.id); // chỉ so sánh id
    }

    @Override
    public int hashCode() {
    return Objects.hash(id); // hash theo id
    }

}
