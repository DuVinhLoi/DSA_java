public class TestBaiTapSinglyLinkedList {
    public static void main(String[] args) {
        BaiTapSinglyLinkedList<String> list = new BaiTapSinglyLinkedList<>();

        list.addFirst("Nguyễn Văn A");
        list.addFirst("Nguyễn Văn B");
        list.addFirst("Nguyễn Văn C");
        list.addFirst("Nguyễn Văn D");
        list.addFirst("Nguyễn Văn E");
        list.addLast("Hoàng Văn F");

        list.insertAfter("Nguyễn Văn B", "Nguyễn Văn G");

        list.traverse();

        list.remove("Hoàng Văn F");
        list.remove("Nguyễn Văn D");

        list.traverse();
    }
}
