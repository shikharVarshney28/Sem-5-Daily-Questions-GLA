// Last updated: 8/7/2025, 2:53:36 PM
class Solution {
    public int numRabbits(int[] answers) {
        //int max = Arrays.stream(answers).max();
        int max=-1;
        for(int i:answers){
            max=Math.max (max,i);
        }
        int freq[]=new int[max+1];
        int res =0;
        for(int i : answers){
            freq[i]++;
            //Check the freq of rabbits who says thatthatthe other rabbits with its color is...if the claim became more than the number that means the rabbit has different color so we need to restart the count but beifre just add the (i+1);
            if(freq[i] == i+1){
                res+=(i+1);
                freq[i]=0;
            }
        }
        for(int i =0;i<max+1;i++){
            if(freq[i]!=0){
                res+=(i+1);
            }
        }
        return res;
    }
}