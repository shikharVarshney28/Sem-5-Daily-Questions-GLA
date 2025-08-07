// Last updated: 8/7/2025, 2:53:19 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int st=0,end=image.length-1;
            while(st<=end){
                //reverse
                int val1=image[i][end];
                int val2=image[i][st];
                //invert
                image[i][st] = val1 ^ 1;
                image[i][end] = val2 ^ 1;
                st++;end--;
            }
        }
        return image;
    }
}