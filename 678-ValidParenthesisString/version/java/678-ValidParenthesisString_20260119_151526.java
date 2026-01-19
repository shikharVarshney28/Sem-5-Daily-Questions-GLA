// Last updated: 1/19/2026, 3:15:26 PM
1class Solution {
2    public boolean checkValidString(String s) {
3        int minOpen = 0, maxOpen = 0;
4        for (char ch : s.toCharArray()) {
5            if (ch == '(') {
6                minOpen++;
7                maxOpen++;
8            } else if (ch == '*') {
9                minOpen--;
10                maxOpen++;
11            } else {
12                minOpen--;
13                maxOpen--;
14            }
15            if(minOpen < 0) minOpen = 0;
16            if(maxOpen < 0) return false;
17        }
18        return minOpen == 0;
19    }
20}