// Last updated: 8/7/2025, 2:49:33 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        String a=s.substring(0,n/2),b=s.substring(n/2,n);
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i'||ch=='o' || ch=='u' || ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U') count++;
        }
        System.out.print(a);
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u' || ch=='A'||ch=='E'||ch=='I' || ch=='O' || ch=='U') count--;
        }
        return count==0;
    }
}