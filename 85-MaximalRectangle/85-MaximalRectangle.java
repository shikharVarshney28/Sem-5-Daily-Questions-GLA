// Last updated: 8/7/2025, 2:59:34 PM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[] arr = new int[matrix[0].length];
        int ans = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '0')
                    arr[j] = 0;
                else
                    arr[j]++;
            }
            ans = Math.max(ans, largestRectangleArea(arr));
        }
        return ans;
    }

    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int h = arr[st.pop()];
                int r = i;
                if (st.isEmpty())
                    ans = Math.max(h * r, ans);
                else {
                    int l = st.peek();
                    int area = h * (r - l - 1);
                    ans = Math.max(ans, area);
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.isEmpty()) {
            int h = arr[st.pop()];
            if (st.isEmpty())
                ans = Math.max(h * r, ans);
            else {
                int l = st.peek();
                int area = h * (r - l - 1);
                ans = Math.max(ans, area);
            }
        }
        return ans;
    }
}