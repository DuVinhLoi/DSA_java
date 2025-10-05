

public class ArrayStack<T> implements StackADT<T>{
    // Biết số lượng phần tử trong stack và vị trí tiếp theo
    private int top;
    // Mảng chứa các phần tử được đưa vào trong stack
    private T[] stack;
    // Kích thước mặc định của mảng
    private final int DEFAULT_CAPACITY = 100;

    public  ArrayStack() {
        top = 0;
        stack = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int capacity) {
        top = 0;
        stack = (T[]) new Object[capacity];
    }

    public void expendCapicity() {
       // 1 2 3 4 5 6
       // Tạo ra mảng có kích thước gấp đôi
      T[] newStack = (T[]) new Object[stack.length * 2];
       // _ _ _ _ _ _ _ _
       // Copy dữ liệu mảng cũ sang mảng mới
      for(int i =0; i<stack.length; i++) {
        newStack[i] = stack[i];
      }
      // 1 2 3 4 5 6 _ _ _ _ _ _ _ _
      stack = newStack;
    }

    @Override
    public void push(T element) {
        if(size() == stack.length) {
            expendCapicity(); // Mở rộng kích thước của mảng xếp
        }
        stack [top] = (T) element; // Đưa phần tử vào đỉnh stack
        top++; // Tăng chỉ số đỉnh của stack lên 1
    }

    @Override
    public T pop() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Stack rỗng");
        }
        // không có 3 dòng này thì khi xóa đi rồi lấy gì return
        top--; // Giảm chỉ số đỉnh stack
        T result = stack[top]; // Lấy phần tử ở đỉnh stack
        stack[top] = null; // Xóa phần tử ở đỉnh stack
        return result; // Trả về phần tử
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new UnsupportedOperationException("Stack rỗng");
        }
        return stack[top-1];
    }

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.top;
    }
    
}
