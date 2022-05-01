import java.util.Stack;
 
class Main
{
    // Function to evaluate a given postfix expression
    public static int evalPostfix(String exp)
    {
        // base case
        if (exp == null || exp.length() == 0) {
            System.exit(-1);
        }
 
        // create an empty stack
        Stack<Integer> stack = new Stack<>();
 
        // traverse the given expression
        for (char c: exp.toCharArray())
        {
            // if the current character is an operand, push it into the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            }
            // if the current character is an operator
            else {
                // remove the top two elements from the stack
                int x = stack.pop();
                int y = stack.pop();
 
                // evaluate the expression 'x op y', and push the
                // result back to the stack
                if (c == '+') {
                    stack.push(y + x);
                }
                else if (c == '-') {
                    stack.push(y - x);
                }
                else if (c == '*') {
                    stack.push(y * x);
                }
                else if (c == '/') {
                    stack.push(y / x);
                }
            }
        }
 
        // At this point, the stack is left with only one element, i.e.,
        // expression result
        return stack.pop();
    }
 
    public static void main(String[] args)
    {
        String exp = "138*+";
        System.out.println(evalPostfix(exp));
    }
}



 // baspc calculater

 class Solution {
    public int calculate(String s) {
        Stack<Integer> stck = new Stack<Integer>();
        char op = '+';
        int res=0, num=0, len = s.length();
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
                if(Character.isDigit(c)){
                    num*=10;
                    num+=c-'0';
                }
                if((!Character.isDigit(c) && c!=' ')||i==len-1){
                    if(op == '+'){
                        stck.push(num);
                    }else if(op == '-'){
                        stck.push(-num);
                    }else if(op == '*'){
                        stck.push(stck.pop()*num);
                    }else if(op == '/'){
                        stck.push(stck.pop()/num);
                    }
                    num = 0;
                    op = c;
                }
        }
        while(!stck.isEmpty()){
            res+=stck.pop();
        }
        return res;
    }
}