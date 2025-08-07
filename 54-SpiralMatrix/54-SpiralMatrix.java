// Last updated: 8/7/2025, 3:00:14 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minC=0,minR=0,maxC=matrix[0].length-1,maxR=matrix.length-1;
        //Place 4 pointers
        int te=matrix.length*matrix[0].length,count=0;
        List<Integer> ans=new ArrayList<>();
        while(count<te){
        for(int i=minC;i<=maxC && count++<te;i++) ans.add(matrix[minR][i]);
        minR++;
        for(int i=minR;i<=maxR && count++<te;i++) ans.add(matrix[i][maxC]);
        maxC--;
        for(int i=maxC;i>=minC && count++<te;i--) ans.add(matrix[maxR][i]);
        maxR--;
        for(int i=maxR;i>=minR && count++<te;i--) ans.add(matrix[i][minC]);
        minC++;
        }
        return ans;
    }
}