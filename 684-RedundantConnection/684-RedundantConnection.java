// Last updated: 8/7/2025, 2:54:09 PM
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adjList =new ArrayList <>();
        int n=edges.length;
        for(int i=0;i<=n;i++) adjList.add (new ArrayList <>());
        for(int edge []:edges){
            adjList.get (edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        int size[]=new int[n+1];
        Queue<Integer> qu=new LinkedList <>();
        for(int i=1;i<=n;i++){
            size[i]=adjList.get(i).size();
            if(size[i]<2) qu.add(i);
        }
       // System.out.println(qu);
        while(qu.size ()>0){
            int src=qu.poll ();
            for(int i:adjList.get(src)){
                adjList.get(i).remove(adjList.get(i).indexOf(src));
                size[i]--;
                if(size[i]<2) qu.add (i);
            }
        }
        //for(int i:size) System.out.print(i);
        int i=n-1;
        for(;i>=0;i--){
            if(size[edges[i][0]] >= 2 && size[edges[i][1]]>=2)
            return edges[i];
        }
        return new int[]{-1,-1};
    }
}









