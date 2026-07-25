class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') st.push(')');
            else if (ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
            else {
                if (st.isEmpty() || st.pop() != ch)
                    return false;
            }
        }

        return st.isEmpty();
    }
}
// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         int n=s.length();

//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             char p=' ';
//             if(!stack.isEmpty())p=stack.peek();
//             if("({[".indexOf(ch)!=-1){
//                 stack.push(ch);
//             }
//             else{
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 else if((p=='(' && ch==')' )|| (p=='[' && ch==']' ) || (p=='{' && ch=='}' )){
//                 stack.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
            
//         }
//         return stack.isEmpty();
//     }
// }