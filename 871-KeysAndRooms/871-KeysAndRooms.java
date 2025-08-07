// Last updated: 8/7/2025, 2:53:15 PM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> qu=new LinkedList <>();
        //HashSet<Integer> hSet =new HashSet <>();
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        qu.add (0);
        while(!qu.isEmpty ()){
            int room=qu.poll ();
            if(!vis[room]) n--;
            vis[room]=true;
            for(int key:rooms.get(room)){
                if(vis[key]) continue;
                qu.add (key);
            }
        }
        return n==0;
    }
}