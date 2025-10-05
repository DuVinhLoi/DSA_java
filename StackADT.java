public interface StackADT<T> {
    //Thêm phần tử
    public void push(T element);
    //Trả về và loại bỏ phần tử ở đỉnh
    public Object pop();
    //Trả về phần tử ở đỉnh mà không loại bỏ
    public Object peek();
    //Kiểm tra stack rỗng
    public boolean isEmpty();
    //Lấy ra số lượng phần tử
    public int size();
    //Láy ra chuỗi của các phần tử Stack 
    public String toString();
}
