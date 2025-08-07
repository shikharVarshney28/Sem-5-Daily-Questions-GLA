// Last updated: 8/7/2025, 2:56:15 PM
class Solution {
    int dp[];

    int breaking(int n, int pro, int end) {
        if (n <= 1)
            return 1;
        if (dp[n] != 0)
            return dp[n];
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (i == end) // to stop the call from making pair 2 ---> (2,0)  this will happend when main call call itself i.e n = 2 call (i==2) thus we prevent it...
                //equality is important because if call for 9 is 3--->3---->?
                //then at call 3 (last) the sum become 4 so i shld move to 1 to 4...otherwise i will move only 1 to 3.... 
                continue;
            max = Math.max(max, breaking(n - i, pro, end) * i);
        }
        //System.out.println(n+" "+max);
        return dp[n] = max;
    }

    public int integerBreak(int n) {
        dp = new int[n + 1];
        return breaking(n, 1, n);
    }
}