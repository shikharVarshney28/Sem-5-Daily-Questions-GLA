// Last updated: 8/7/2025, 2:53:06 PM
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashMap<Integer,HashSet<Integer>> hmap=new HashMap<>();
        for(int [] obs:obstacles)
        {
            if(!hmap.containsKey(obs[0])) hmap.put(obs[0], new HashSet<>());
            hmap.get(obs[0]).add(obs[1]);
        }
        int direction[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int currPos[][]={{0,0}};
        int currDirection=0;
        int maxDist=0;
        for(int command:commands)
        {
            if(command==-1){
                //turn right where ur are standing so change the direction
                currDirection=(currDirection+1)%4;
                continue;
            }
            if(command==-2){
                //turn left
                currDirection=currDirection-1;
                if(currDirection==-1) currDirection=3;
                continue;
            }
            // +ve no
            int dir[]=direction[currDirection];
            int currX=currPos[0][0],currY=currPos[0][1];
            for(int i=0;i<command;i++)
            {
                currX+=dir[0];
                currY+=dir[1];
                if(hmap.containsKey(currX) && hmap.get(currX).contains(currY)) break;
                maxDist=Math.max(maxDist,(currX*currX+currY*currY));
                currPos=new int [][]{{currX,currY}};
            }
        }

        return maxDist;
    }
}