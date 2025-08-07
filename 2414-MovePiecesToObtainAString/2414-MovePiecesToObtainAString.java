// Last updated: 8/7/2025, 2:47:45 PM
class Solution {
    public boolean canChange(String start, String target) {
        int n=start.length();
        int i=0,j=0;
        while(i<n || j<n){
            //Skipping the blanks and pointing to some chars 
            while(i<n && start.charAt(i)=='_') i++;
            while(j<n && target.charAt(j)=='_') j++;

            // check index out or bound
            if(i==n || j==n) return (i==n && j==n);
            // Now both will be pointing at L Or R 
            if(start.charAt(i)!=target.charAt(j) || start.charAt(i)=='L' && i<j || start.charAt(i)=='R' && j<i) return false;
            i++;j++;
        }
        return true;
    }
}