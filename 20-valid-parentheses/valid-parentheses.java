class Solution {
    public boolean isValid(String s) {
    Stack<Character>st=new Stack<>();
    if(s.length()==1){
        return false;
    }
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='{'||ch=='('||ch=='['){
            st.push(ch);
        }else{
            if (st.isEmpty()) return false;
        if((ch=='}'&&st.peek()!='{')||
        (ch==')'&&st.peek()!='(')||
        (ch==']'&&st.peek()!='[')){
            return false;
        }else if(!st.isEmpty()){
        st.pop();
        }

        }
         
    }
    
    return st.isEmpty();
        
    }
}