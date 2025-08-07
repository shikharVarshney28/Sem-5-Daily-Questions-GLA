// Last updated: 8/7/2025, 2:50:59 PM
class Solution {
       boolean Maximum(int [][]arr,int ele,int row,int col)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                if(arr[row][i]<ele) return false;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i][col]>ele) return false;
            }
            return true;
        }
    public List<Integer> luckyNumbers(int [][]matrix){
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(Maximum(matrix,matrix[i][j],i,j)) ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}