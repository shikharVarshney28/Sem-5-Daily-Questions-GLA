// Last updated: 8/7/2025, 2:56:06 PM
class Solution {
    public boolean isPerfectSquare(int num) {
       return (int)Math.pow((int)Math.pow(num,.5),2)==num;
       //return (int)Math.pow(b,2)==num;
    }
}