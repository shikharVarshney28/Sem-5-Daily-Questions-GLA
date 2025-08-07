// Last updated: 8/7/2025, 2:51:19 PM
class Solution {
    public int maximum69Number (int num) {
        StringBuilder nums= new StringBuilder(""+num);
        //System.out.println(nums);
        for(int i=0;i<nums.length();i++){
            if(nums.charAt(i)=='6'){
                nums.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(nums.toString());
    }
}