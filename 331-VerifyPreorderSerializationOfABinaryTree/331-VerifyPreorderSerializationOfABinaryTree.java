// Last updated: 8/7/2025, 2:56:21 PM
class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder.length()==1 && preorder.charAt(0)=='#') return true;
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<preorder.length();){
            if(preorder.charAt(i)==',') {
                i++;
                continue;
            }
            if(i!=0 && st.size()==0) return false;
            if(preorder.charAt(i)!='#'){
                int j=i;
                while(j<preorder.length () && preorder.charAt(j)!=',') j++;
                int s = Integer.parseInt(preorder.substring(i,j));
                if(st.isEmpty()){
                    st.push(new int[]{s,-1,-1});
                }else{
                    // this will be either right or left
                    if(st.peek()[1]==-1){
                        //this iz left
                        st.peek()[1]=1;
                    }else{
                        //this is right
                        st.peek()[2]=1;
                    }
                    st.push(new int[]{s,-1,-1});
                    
                }
                i=j;
                
            }else{
                //this is null
                if(st.size()==0) return false;
                if(st.peek()[1]==-1){
                        //this iz left
                        st.peek()[1]=1;
                }else{
                        //this is right
                        st.peek()[2]=1;
                }
                while(st.size()>0 && st.peek()[2]==1) st.pop();
                
                i++;
            }
        }
        return st.size()==0;
        
    }
}