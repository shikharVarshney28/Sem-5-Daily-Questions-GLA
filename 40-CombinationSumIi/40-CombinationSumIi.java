// Last updated: 8/7/2025, 3:00:36 PM
class Solution {
    void combiSum(int []arr,int idx,int target,ArrayList ds,List<List<Integer>> answer)
    {
        if(target==0){
            answer.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i-1]==arr[i]) continue;
            if(target>=arr[i]){
                ds.add(arr[i]);
                combiSum(arr,i+1,target-arr[i],ds,answer);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(candidates);
        combiSum(candidates,0,target,new ArrayList<>(),answer);
       
        
        return answer;
    }
}