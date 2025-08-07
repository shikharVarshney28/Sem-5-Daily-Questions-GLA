// Last updated: 8/7/2025, 2:57:59 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber > 26) {
            int lastLetter = columnNumber % 26;
            if (lastLetter == 0) {
                lastLetter = 26; //This is converted to Z by adding 1 in the previous digit
                columnNumber--;
            }
            ans = (char) (lastLetter - 1 + 'A') + ans;
            columnNumber /= 26;
        }
        return (char) (columnNumber - 1 + 'A') + ans;
    }
}