public class SinglyLinkedListSinhVienDS {
    private BaiTapSinglyLinkedList<SinglyLinkedListSinhVien> list;

    public SinglyLinkedListSinhVienDS() {
        this.list = new BaiTapSinglyLinkedList<>();
    }
    
    public void addStudent(SinglyLinkedListSinhVien student) {
        this.list.addLast(student);
    }
    
    public void printList() {
        this.list.traverse();
    }

    public boolean removeStudent(SinglyLinkedListSinhVien student) {
        return this.list.remove(student); //Gọi về hàm remove trong BaiTapSinglyLinkedList trong hàm remove có equals sẽ gọi về hàm equals trong SinglyLinkedListSinhVien và so sánh
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public boolean findStudentById(SinglyLinkedListSinhVien student) {
        return this.list.findItem(student);
    }

    
    public boolean updateStudent(String id, String newName, int newAge, double newGpa) {
    BaiTapSinglyLinkedListNode<SinglyLinkedListSinhVien> temp = this.list.getHead();
    while (temp != null) {
        if (temp.getData().getId().equals(id)) {
            // Cập nhật thông tin
            temp.getData().setName(newName);
            temp.getData().setAge(newAge);
            temp.getData().setGpa(newGpa);
            return true; // Sửa thành công
        }
        temp = temp.getNext();
    }
    return false; // Không tìm thấy
}

}
