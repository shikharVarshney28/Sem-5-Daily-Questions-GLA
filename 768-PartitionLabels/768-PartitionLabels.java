// Last updated: 8/7/2025, 2:53:48 PM
class Solution {
    public List<Integer> partitionLabels(String s) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        HashSet<Character> hSet = new HashSet<>();
        int i = 0,st=0;
        List<Integer> ans = new ArrayList<>();
        while (i < s.length()) {
            hSet.add(s.charAt(i));
            arr[s.charAt (i) - 'a']--;
            if(arr[s.charAt(i) - 'a']==0) hSet.remove(s.charAt (i));
            //System.out.println(i+" "+hSet);
            if (hSet.size() == 0) {
                ans.add (i - st +1);
                st=i+1;
            }
            i++;
        }
        return ans;
    }
}