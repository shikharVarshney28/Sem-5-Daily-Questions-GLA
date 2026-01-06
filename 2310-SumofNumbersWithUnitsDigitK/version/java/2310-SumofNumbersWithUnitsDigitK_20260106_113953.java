// Last updated: 1/6/2026, 11:39:53 AM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if (num == 0)
4            return 0;
5        if (k == 0)
6            if (num % 10 == 0) //E.g. 20,1590,3000
7                return 1;
8            else
9                return -1;
10        for (int i = 1; i <= num / k; i++) // Start with set size 1 and look for set having unit's digit equal to that of num
11            if (num % 10 == ((i * k) % 10)) // Look for equal unit's digit
12                return i;
13
14        return -1;
15    }
16}