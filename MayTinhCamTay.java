import java.util.Scanner;
import java.util.Stack;
/*Ý tưởng

Chương trình áp dụng thuật toán Shunting-yard (Dijkstra):

Duyệt từng ký tự trong chuỗi.

Nếu là số → thêm ngay vào kết quả (result).

Nếu là ngoặc mở ( → đưa vào stack.

Nếu là ngoặc đóng ) → pop toán tử từ stack ra result cho đến khi gặp ngoặc mở.

Nếu là toán tử (+ - * / ^) →

Pop toán tử trong stack có độ ưu tiên cao hơn hoặc bằng toán tử hiện tại → đưa vào result.

Sau đó push toán tử hiện tại vào stack.

Sau khi duyệt hết, nếu stack còn toán tử → pop hết ra result */
public class MayTinhCamTay {
    public static int doUuTien(char op){
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/') return 2;
        if(op == '^') return 3;
        return 0;
    }

    public static String chuyenHauTo(String bieuThuc){
        Stack<Character> stack = new Stack<>();
        String result ="";
        for(int i =0; i<bieuThuc.length(); i++){
            char ch = bieuThuc.charAt(i);
            if(ch == ' ') continue;

            //Nếu là số thì bỏ vào result
            if(Character.isDigit(ch)){
                String so = "";
                while(i<bieuThuc.length() && (Character.isDigit(bieuThuc.charAt(i)) || bieuThuc.charAt(i) == '.')){
                    so += bieuThuc.charAt(i);
                    i++;
                }   
                result += so+" ";
                i--;
            }
            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek()!= '('){
                    result += stack.pop() + " ";
                }
                if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
            }
            else if(ch == '+'|| ch =='-' || ch == '*' || ch == '/' || ch == '^'){
                while(!stack.isEmpty() && doUuTien(stack.peek()) >= doUuTien(ch)){
                    result += stack.pop() + " ";
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop() + " ";
        }
        return result;
    }

    public static double tinhHauTo(String hauTo) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = hauTo.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                    case "^" -> stack.push(Math.pow(a, b));
                }
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bieuThuc = sc.nextLine();
        String hauTo = chuyenHauTo(bieuThuc);
        double ketQua = tinhHauTo(hauTo);
        System.out.println(hauTo);
        System.out.println(ketQua);
    }
}

