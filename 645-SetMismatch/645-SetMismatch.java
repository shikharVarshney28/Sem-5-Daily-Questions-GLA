// Last updated: 8/7/2025, 2:54:18 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        HashSet<Integer> h=new HashSet<>();
        int repeated=0,maxVal=0,sumNums=0;
        for(int i:nums){
            if(!h.contains(i)) h.add(i);
            else{
                repeated=i;
            }
            maxVal=(int)Math.max(maxVal,i);
            sumNums+=i;
        }
        int z=1;
        while(true)
        {
            if(!h.contains(z)) break;
            z++;
        }
        ans=new int[]{repeated,z};
        return ans;

    }
}