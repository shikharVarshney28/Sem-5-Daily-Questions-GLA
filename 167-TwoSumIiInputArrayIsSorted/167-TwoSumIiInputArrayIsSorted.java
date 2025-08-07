// Last updated: 8/7/2025, 2:58:01 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int []ans={-1};
        for(int i=0;i<numbers.length;i++)
        {
            int number=target-numbers[i];
            if(hmap.containsKey(number))
            {
                ans=new int[]{i+1,hmap.get(number)+1};
                break;
            }
            else hmap.put(numbers[i],i);
        }
        Arrays.sort(ans);
        return ans;
    }
}