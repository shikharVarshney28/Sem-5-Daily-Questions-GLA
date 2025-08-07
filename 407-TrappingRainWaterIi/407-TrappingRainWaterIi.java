// Last updated: 8/7/2025, 2:55:47 PM
class Solution {
    public int trapRainWater(int[][] heightMap) {
        int [][] direction={{0,-1},{0,1},{1,0},{-1,0}};
        PriorityQueue<int []> pq=new PriorityQueue <>((a,b)-> a[0]-b[0]);
        boolean isVis[][]=new boolean [heightMap.length][heightMap[0].length];
        //stire boundary val and mark it vis
        int m=heightMap.length,n=heightMap [0].length;
        for(int i=0;i<m;i++){
            pq.add (new int[]{heightMap [i][0],i,0});
            isVis[i][0]=true;
        }
        for(int i=0;i<m;i++){
            pq.add(new int[]{heightMap [i][n-1],i,n-1});
            isVis[i][n -1]=true;
        }
        for(int i=0;i<n;i++){
            pq.add(new int[]{heightMap [0][i],0,i});
            isVis[0][i]=true;
        }
        for(int i=0;i<n;i++){
            pq.add(new int[]{heightMap [m-1][i],m-1,i});
            isVis[m-1][i]=true;
        }

        int waterLevel=0,ans=0;
        while(!pq.isEmpty ()){
            int [] temp=pq.poll ();
            //check the level
            waterLevel=Math.max (waterLevel,temp[0]);
            isVis[temp[1]][temp[2]]=true;
            for(int dir[]:direction){
                int r=temp[1]+dir[0],c=temp[2]+dir[1];
                if(r<0 || c<0 || r>=heightMap.length || c>=heightMap[0].length || isVis[r][c]) continue;
                isVis[r][c]=true;
                pq.add (new int[]{heightMap [r][c],r,c});
                int val=waterLevel- heightMap [r][c];
                if(val>0) ans+=val;
            }
        }
        return ans;
    }
}






