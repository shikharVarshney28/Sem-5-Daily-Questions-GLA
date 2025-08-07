// Last updated: 8/7/2025, 2:49:54 PM
class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int num:nums){
            if(!h.containsKey(num)) h.put(num,1);
            else h.put(num,h.get(num)+1);
        }
        Integer temp[]=new Integer[nums.length];
        int z=0;
        for(int i:nums) temp[z++]=i;
        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(h.get(a)==h.get(b)) return b-a;  // DEcreasing when freqs are same
                //else sort in ascending orger of freq
                return h.get(a)-h.get(b);
            }
        });
       for(int i=0;i<temp.length;i++) nums[i]=temp[i];
       return nums;
    }
}