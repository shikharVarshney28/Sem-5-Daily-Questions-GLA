// Last updated: 8/7/2025, 2:44:12 PM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<height.length;i++){
            if(height[i-1]>threshold ) ans.add(i);
        }
        return ans;
    }
}