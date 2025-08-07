// Last updated: 8/7/2025, 2:50:41 PM
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> a=new ArrayList<>();
        int []ans=new int[n+1];
        for(int i=0;i<target.length;i++)
            ans[target[i]]++;
        if(n-target[target.length-1]==0){
        for(int i=1;i<ans.length;i++)
        {
            if(ans[i]==0)
            {
                a.add("Push");
                a.add("Pop");
            }
            else a.add("Push");
        }
    }
    else{
        for(int i=1;i<=target[target.length-1];i++)
        {
            if(ans[i]==0){
                a.add("Push");
                a.add("Pop");
            }
            else a.add("Push");
        }
    }

        return a;
    }
}