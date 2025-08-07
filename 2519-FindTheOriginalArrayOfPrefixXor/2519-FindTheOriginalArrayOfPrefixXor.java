// Last updated: 8/7/2025, 2:47:07 PM
class Solution {
    public int[] findArray(int[] pref) {
        int var=pref[0];
        if(pref.length==1) return pref;
        int arr[]=new int[pref.length];
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
            //System.out.println(pref[i]^pref[i-1]);
            arr[i]=pref[i-1]^pref[i];    
        }
        return arr;
    }
}