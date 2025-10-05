public class BaiTapSinglyLinkedListNode<T> {
    private T data;
    private BaiTapSinglyLinkedListNode<T> next;

    public BaiTapSinglyLinkedListNode(){

    }
    public BaiTapSinglyLinkedListNode(T data, BaiTapSinglyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaiTapSinglyLinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(BaiTapSinglyLinkedListNode<T> next) {
        this.next = next;
    }
}
