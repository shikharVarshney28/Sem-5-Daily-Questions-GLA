// Last updated: 8/7/2025, 2:47:24 PM
class Solution {
    public int maximumSum(int[] nums) {
        //
        HashMap<Integer,Integer>hmap=new HashMap <>();
        Arrays.sort (nums);
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int num=nums[i],sum=0;
            while(num>0){
                sum+=(num%10);
                num/=10;
            }
            if(hmap.containsKey (sum)){
                int val= hmap.get (sum) + nums[i];
                ans=Math.max (ans,val);
                hmap.put (sum,Math.max (nums[i],hmap.get (sum)));
            }else{
                hmap.put (sum,nums[i]);
            }
        }
        ///for(int i:hmap.keySet ())
          //System.out.println (i+" "+hmap.get(i)[0]+" "+hmap.get(i)[1]);
        return ans;
        
    }
}