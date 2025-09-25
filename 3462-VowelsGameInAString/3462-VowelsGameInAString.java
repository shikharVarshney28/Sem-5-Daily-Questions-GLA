// Last updated: 9/25/2025, 4:51:39 PM
class Solution {
    //in this alice will always win only iff vowel count !=0....if vowel count is odd then alice will delete all and if vowel count is even so it will sub aany odd number<num and since even - odd = odd so alice wins
    public boolean doesAliceWin(String s) {
        boolean flag = false;
        for(char ch : s.toCharArray ()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                flag = true; break;
                }
        }
        return flag;
    }
}