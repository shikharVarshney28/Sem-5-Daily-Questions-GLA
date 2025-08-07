// Last updated: 8/7/2025, 2:52:31 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int freshOranges=0;
        boolean isVisisted[][]=new boolean[grid.length][grid[0].length];
        Queue<int[]>qu=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) freshOranges++;
                if(grid[i][j]==2) {
                    qu.add (new int[]{i,j});
                    isVisisted[i][j]=true;
                }
            }
        }
        if(freshOranges==0) return 0;
        int [][] adjList={{0,-1},{-1,0},{1,0},{0,1}};
        int min=0;
        while(qu.size ()>0){
            int size=qu.size ();
            for(int i=0;i<size;i++){
                int temp[]=qu.poll ();
                for(int child[]:adjList){
                    int row=child[0]+temp[0],col=child[1]+temp[1];
                    if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0||isVisisted [row][col]) continue;
                    isVisisted[row][col]=true;
                    if(grid[row][col]==1) {
                        grid[row][col ]=2;
                    }
                    qu.add(new int[]{row,col});
                }
            }
            min++;
            freshOranges-=qu.size ();
            if(freshOranges==0) break;
            
        }
        return freshOranges==0?min:-1;
    }
}







