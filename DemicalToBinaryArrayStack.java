public class DemicalToBinaryArrayStack {
        public static String DemicaltoBinary(int demical) {
            ArrayStack<Integer> stack = new ArrayStack<Integer>(); 
            while(demical > 0) {
                int remainder = demical % 2; 
                stack.push(remainder); 
                demical /= 2; 
            }
            StringBuilder binary = new StringBuilder(); //String result = "";
            while(!stack.isEmpty()) {
                 binary.append(stack.pop()); // result += stack.pop();
            }
            return binary.toString();
        }
}
