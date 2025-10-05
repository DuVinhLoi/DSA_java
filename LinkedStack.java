// Tái chế lại BaiTapSinglyLinkedListNode
public class LinkedStack<T> implements StackADT<T> {
    private int count;
    private BaiTapSinglyLinkedListNode<T> top;

    public LinkedStack(){
        count = 0;
        top = null;
    }
    @Override
    public void push(T element) {
        // Bước 1: tạo node mới
        BaiTapSinglyLinkedListNode<T> newNode = new BaiTapSinglyLinkedListNode<>(element, null);
        // Bước 2 Gán next element với top
        newNode.setNext(top);
        // Bước 3: Gán node với top
        top = newNode;
        count++;
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Stack rỗng");
        }
        T result = top.getData(); //Lấy ra giá trị top node
        top = top.getNext(); //Di chuyển top trỏ sang phần tử tiếp theo 
        count--; //Giảm số lượng phần tử
        return result; //Trả về kết quả
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Stack rỗng");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
    
}
