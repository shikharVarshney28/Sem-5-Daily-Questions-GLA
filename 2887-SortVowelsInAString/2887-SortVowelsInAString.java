// Last updated: 8/7/2025, 2:45:59 PM
class Solution {
    public String sortVowels(String s) {
       ArrayList<Character> a=new ArrayList<>();
       for(int i=0;i<s.length();i++)
       {
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U' || ch=='a' || ch=='e'|| ch=='o'|| ch=='u'|| ch=='i') a.add(ch);
       }
       StringBuilder ans=new StringBuilder(s);
       Collections.sort(a);
       //System.out.println(a);
       int idx=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=ans.charAt(i);
        if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' || ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') ans.setCharAt(i,a.get(idx++));
       }
       return ans.toString();

    }
}