// Last updated: 8/7/2025, 2:51:47 PM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int minSteps=0,refill=capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=capacity){
                minSteps+=1;
                capacity-=plants[i];
            }
            else{
                capacity=refill;
                minSteps+=(i);
                minSteps+=(i+1);
                capacity-=plants[i];

            }
        }
        return minSteps;
    }
}