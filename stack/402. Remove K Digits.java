class Solution {
    Stack <Character> stack = new Stack<Character>();
    public String removeKdigits(String num, int k) {
        String output = "";
        for(int i = 0; i<num.length();i++)
        {
            while(!stack.isEmpty() && stack.peek() > num.charAt(i) && k > 0)
            {
                stack.pop();
                k--;
            }
            if(!(stack.isEmpty() && num.charAt(i) == '0'))
            {
                stack.push(num.charAt(i));
            }
        }
        while(!stack.isEmpty() && k-->0)
            stack.pop();
        for(char x: stack)
            output+=x;
        if(output == "")
            output = "0";
        return output;
    }
}
