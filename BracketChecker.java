public class BracketChecker {
    public static boolean isBalanced(String code) {
        LinkedStack<Character> stack = new LinkedStack<>();
        //Duyệt lần lượt từng ký tự
        //Tình huống 3: Những ký tự khác => Không quan tâm tới
        for(int i=0; i<code.length(); i++) {
            //Tình huống 1: [, {, (
            //Đưa vào trong stack
            char ch = code.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
                //Tình huống 2: ], }, )
                //Kiểm tra stack có rỗng không nếu rỗng => false
                //Nếu không rỗng => Lấy ký tự ở đỉnh stack => Nếu ký tự ở đỉnh stack giống với ký tự hiện tại => true ngược lại false
            else if(ch == '}' || ch == ']' || ch == ')') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                System.out.println("Ch =" +ch + " top = " + top);
                if(ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
                    return false;
                }
            }
                
            
        }
        return stack.isEmpty(); 
    }
}
