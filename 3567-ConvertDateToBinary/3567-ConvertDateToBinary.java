// Last updated: 8/7/2025, 2:44:18 PM
class Solution {
    public String convertDateToBinary(String date) {
        return Integer.toBinaryString(Integer.parseInt(date.substring(0,4)))+"-"+Integer.toBinaryString(Integer.parseInt(date.substring(5,7)))+"-"+Integer.toBinaryString(Integer.parseInt(date.substring(8)));
    }
}