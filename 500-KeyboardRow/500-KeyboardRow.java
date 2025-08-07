// Last updated: 8/7/2025, 2:55:09 PM
class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> firstRow = new HashSet<>();
        HashSet<Character> SecondRow = new HashSet<>();
        HashSet<Character> thirdRow = new HashSet<>();
        String one = "qwertyuiopQEWRTYUIOP", two = "asdfghjklASDFGHJKL", three = "zxcvbnmZXCVBNM";
        for (char ch : one.toCharArray()) {
            firstRow.add(ch);
        }
        for (char ch : two.toCharArray()) {
            SecondRow.add(ch);
        }
        for (char ch : three.toCharArray()) {
            thirdRow.add(ch);
        }
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            HashSet<Character> checker = (firstRow.contains(word.charAt(0)) ? firstRow
                    : (SecondRow.contains(word.charAt(0)) ? SecondRow : thirdRow));
            boolean f = true;
            
            for (char ch : word.toCharArray()) {

                if (!checker.contains(ch)) {
                    f = false;
                    break;
                }
            }
           // System.out.println (word+" "+ans+" "+f);
            if (f)
                ans.add(word);
        }
        String res[]=new String[ans.size()];
        int idx=0;
        for(String s:ans) res[idx++]=s;
        return res;
    }
}