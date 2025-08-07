// Last updated: 8/7/2025, 2:44:49 PM
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> ballLocation = new HashMap<>();
        HashMap<Integer, Integer> colorBalls = new HashMap<>();
        int ans[] = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int ball = query[0], color = query[1];
            if (!ballLocation.containsKey(ball)) {
                // This is a new ball with color color
                ballLocation.put(ball, color);

            } else {
                // the ball is already there just decrease the count of existing color and paint
                // it with color color
                int oldColor = ballLocation.get(ball);
                ballLocation.put(ball, color);
                if (colorBalls.containsKey(oldColor)) {
                    int val = colorBalls.get(oldColor) - 1;
                    if (val == 0)
                        colorBalls.remove(oldColor);
                    else
                        colorBalls.put(oldColor, val);
                        //System.out.println ("H"+colorBalls);
                }
            }
            // Now Paing the ball with this color;
            if(colorBalls.containsKey(color)) colorBalls.put (color,colorBalls.get(color)+1);
            else colorBalls.put(color,1);

            ans[idx++] = colorBalls.size();

        }
        return ans;
    }

}