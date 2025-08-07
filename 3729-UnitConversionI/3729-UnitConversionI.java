// Last updated: 8/7/2025, 2:43:52 PM
class Solution {
    int mod = (int)(Math.pow(10,9)+7);
    public int[] baseUnitConversions(int[][] conversions) {
        List<List<int[]>> adjList =new ArrayList<>();
        int n=conversions.length;
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            adjList.add (new ArrayList <>());
        }
        for(int i[]:conversions){
            adjList.get (i[0]).add(new int[]{i[1],i[2]});
        }
        Arrays.fill (arr,Integer.MAX_VALUE);
        arr[0]=1;
        Queue<int[]> qu=new LinkedList<>();
        qu.add (new int[]{0,1});
        while(!qu.isEmpty ()){
            int src=qu.peek()[0] , cost = qu.poll ()[1];
            arr[src]=cost;
            for(int i[]:adjList.get(src)){
                long newCost = (long)cost * i[1];
                int ans = (int)(newCost%mod);
                qu.add (new int[]{i[0],ans});
            }
        }
        return arr;
    }
}


