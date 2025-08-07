// Last updated: 8/7/2025, 2:52:07 PM
class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<expression.length ();i++){
            char ch=expression.charAt(i);
            if(ch=='f' || ch=='t' || ch=='(' || ch=='&' || ch=='|' || ch=='!') st.push(ch);
            if(ch==')'){
                ArrayList <Character> res= new ArrayList<>();
                while(st.peek()!='(') res.add(st.pop());
                // Now pop ( at top
                st.pop();
               //now taking the top op
             char op=st.pop();
             if(op=='&'){
    if(res.contains('f')) st.push('f');
    else st.push('t');
     }
            if(op=='|'){
                if(res.contains('t')) st.push('t');
                else st.push('f');
    }
    if(op=='!'){
            if(res.contains('f')) st.push('t');
            else st.push('f');
        }
    }
}
    return st.pop()=='t' ? true:false;
    }
}