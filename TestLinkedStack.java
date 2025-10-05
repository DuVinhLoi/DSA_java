public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack<Integer> stack = new LinkedStack<Integer>(); // Khai báo đối tượng

        stack.push(15);
        stack.push(10);
        stack.push(5);
        
        int x = stack.pop();
        System.out.println(x);
        
        int y = stack.peek();
        System.out.println(y);
        
        int z = stack.pop();
        System.out.println(z);
        
        System.out.println(stack.size());
    }
}