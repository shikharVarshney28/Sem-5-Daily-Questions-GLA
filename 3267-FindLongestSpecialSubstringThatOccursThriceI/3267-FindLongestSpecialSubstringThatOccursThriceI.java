// Last updated: 8/7/2025, 2:45:29 PM
class Solution {
    boolean itsPossible (String s,int range){
        HashMap<Character,Integer> hmap=new HashMap <>();
        int i=0,n=s.length();
        while(i<=n-range){
            String temp=s.substring (i,i+range);
            boolean same=true;
            for(int j=0;j<range -1;j++){
                if(temp.charAt(j)!=temp.charAt(j+1)){
                    same=false;
                    break;
                }
            }
            if(same){
                hmap.put (temp.charAt (0),hmap.getOrDefault (temp.charAt (0),0)+1);
                if(hmap.get (temp.charAt(0))==3) return true;
            }
            
            i++;
        }
        return false;
    }
    public int maximumLength(String s) {
        int st=1,end=s.length (),ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(itsPossible(s,mid)){
                ans=mid;
                st=mid+1;
            }else end=mid-1;
        }
        return ans;
    }
}