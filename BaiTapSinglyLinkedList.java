public class BaiTapSinglyLinkedList<T> {
    private BaiTapSinglyLinkedListNode<T> head; 

    public BaiTapSinglyLinkedList() {
        this.head = null;
    } 
    public BaiTapSinglyLinkedListNode<T> getHead() {
    return head;
    }

    public void traverse(){ //Duyệt phần tử
        BaiTapSinglyLinkedListNode<T> temp = head;
        while (temp != null) {
                //In phần tử
                System.out.println(temp.getData());
                temp = temp.getNext();
        }
    }

    public void addFirst(T item){
        //Bước 1 tạo node
        BaiTapSinglyLinkedListNode<T> newNode = new BaiTapSinglyLinkedListNode<>(); 
        newNode.setData(item);
        newNode.setNext(this.head);
        
        //Bước 2 gắn head
        this.head = newNode;
    }

    public void addLast(T item){
        if(head == null){
            addFirst(item);
        }else{
            BaiTapSinglyLinkedListNode newNode = new BaiTapSinglyLinkedListNode<>();
            newNode.setData(item);
            newNode.setNext(null);
            BaiTapSinglyLinkedListNode temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    //Thêm vào phía sau 1 node nào đó
    public void insertAfter(T key, T toInsert){
        
        //Tìm vị trí chứa key
        BaiTapSinglyLinkedListNode<T> temp = head; //Không muốn bị ảnh hưởng dữ liệu thì tạo temp
        while(temp != null && !temp.getData().equals(key)){
            temp = temp.getNext();
        }

        if(temp != null){
            //Bước 1: Tạo node
            BaiTapSinglyLinkedListNode<T> newNode = new BaiTapSinglyLinkedListNode<>();
            newNode.setData(toInsert);
            //Bước 2: Gắn node với node sau
            newNode.setNext(temp.getNext());
            //Bước 3: Gắn node với node trên
            temp.setNext(newNode);
        }
    }

    public boolean  remove(T key){
        if(head == null){
            return false;
        }

        //Xóa vị trí đầu tiên
        if(head.getData().equals(key)){
            this.head = head.getNext();
            return true;
        }

        //Vị trí ngẫu nhiên
        //Tạo biến tạm
        BaiTapSinglyLinkedListNode<T> prev=null;
        BaiTapSinglyLinkedListNode<T> current = head;

        while(current != null && !current.getData().equals(key)){
            prev = current;
            current = current.getNext();
        }

        if(current == null){
            return false;
        }
        prev.setNext(current.getNext()); //Đặt next của node trước với cái node sau của current (Bỏ qua current)
        return true;
    }

    public boolean isEmpty() {
    return head == null;
    }

    public boolean findItem(T item){
        BaiTapSinglyLinkedListNode<T> temp = head;
        while(temp != null){
            if(temp.getData().equals(item)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

}
