// Last updated: 8/7/2025, 2:52:34 PM
class Solution {
    boolean find(int[] []arr,HashSet<String>h){
        for(String s:h){
            int ch= s.charAt(0)-'a',th=s.charAt(3)-'a';
            if(arr[ch][th]<1000 || arr[th][ch]<1000) return false;
        }
        return true;
    }
    void fw(int arr[][]){
        for(int via=0;via<26;via++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    arr[i][j]= Math.min (arr[i][j],arr[i][via]+arr[via][j]);
                }
            }
        }
    }
    public boolean equationsPossible(String[] equations) {
        HashSet <String> hset = new HashSet <>();
        int arr[][]=new int[26][26];
        for(int i[]:arr){
            Arrays.fill (i,1000);
        }
        for(int i=0;i<26;i++) arr[i][i]=1;
        for(String s:equations){
            char ch = s.charAt(0);
            char th = s.charAt(3);
            if(s.substring(1,3).equals("==")){
                arr[ch-'a'][th-'a']=1;
                arr[th-'a'][ch-'a']=1;
            }else{
                hset.add(s);
            }
        }
        //System.out.println (hset);
        fw(arr);
        /*for(int i[]:arr){
            for(int j:i)
            System.out.print (j+" ");
            System.out.println ();
        }*/
        return find(arr,hset );
    }
}