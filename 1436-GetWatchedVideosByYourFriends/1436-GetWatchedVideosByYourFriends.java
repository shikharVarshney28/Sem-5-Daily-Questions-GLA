// Last updated: 8/7/2025, 2:51:22 PM
class Solution {
    class Pair implements Comparable<Pair>{
        String s;
        int freq;
        Pair(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
        public int compareTo (Pair that ){
            if(this.freq ==that.freq ) return this.s.compareTo(that.s);
            return this.freq-that.freq;
        }
    }
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        int l =0;
        boolean isVisisted[]=new boolean[friends.length];
        Queue<Integer> qu=new LinkedList<>();
        qu.add (id);
        isVisisted [id]=true;
        List<String> ans=new ArrayList<>();
        while(qu.size()>0 && l!=level){
            int size=qu.size ();
            for(int i=0;i<size;i++){
                int temp=qu.poll ();
                for(int child:friends[temp]){
                    if(!isVisisted [child]){
                        isVisisted [child]=true;
                        qu.add (child);
                    }
                }
            }
            l++;
        }
        System.out.println (qu);
        HashMap<String,Integer> hmap=new HashMap<>();
        ArrayList <Pair> arr=new ArrayList<>();
        while(qu.size()>0){
            for(String s:watchedVideos.get(qu.poll()))        {
                hmap.put (s,hmap.getOrDefault (s,0)+1);
            }
        }
        for(String s:hmap.keySet ()){
            arr.add (new Pair(s,hmap.get (s)));
        }
        Collections.sort (arr);
        for(Pair p:arr) ans.add (p.s);
        return ans;
    }
}