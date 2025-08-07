// Last updated: 8/7/2025, 2:49:10 PM
class Solution {
    public int findTheWinner(int n, int k) {
      Queue<Integer> st=new LinkedList<>();
      for(int i=1;i<=n;i++) st.add(i);
      while(st.size()!=1)
      {
        for(int i=1;i<k;i++) st.add(st.remove());
        st.remove(); 
      }
      return st.peek();
       
    }
}