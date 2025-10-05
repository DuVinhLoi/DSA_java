public class LinkedStructure2NodePerson <T> {
    private T data;
    private LinkedStructure2NodePerson<T> next;

    public LinkedStructure2NodePerson() {
        
    }
    public LinkedStructure2NodePerson(T data, LinkedStructure2NodePerson<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkedStructure2NodePerson<T> getNext() {
        return next;
    }

    public void setNext(LinkedStructure2NodePerson<T> next) {
        this.next = next;
    }
}
