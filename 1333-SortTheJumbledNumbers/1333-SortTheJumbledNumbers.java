// Last updated: 8/7/2025, 2:51:44 PM
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int num:nums)
        {
            String s=""+num,temp="";
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                temp+=mapping[ch-'0'];
            }
            h.put(num,Integer.parseInt(temp));
        }
        Integer temp[]=new Integer[nums.length];
        int z=0;
        for(int i:nums) temp[z++]=i;
        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return h.get(a)-h.get(b);
            }
        });
        for(int i=0;i<temp.length;i++) nums[i]=temp[i];
        return nums;
    }
}