// Last updated: 8/7/2025, 2:57:51 PM
class Solution {
    public String largestNumber(int[] nums) {
//our logic is that we try to keep the combination of the idx ele where the comb of them is bigger 
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            String firstCombo=""+nums[i]+nums[j];
            String secondCombo=""+ nums[j]+nums[i];
            if(secondCombo.compareTo(firstCombo)>0){
                // swapping must occure
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            //else continue;
        }
       }
       //we got the updated array where the largest no is at first position...
       if(nums[0]==0) return "0";
       StringBuilder ans=new StringBuilder();
       for(int i:nums) ans.append(i);
       return ans.toString();
    }
}