// Last updated: 9/25/2025, 4:50:42 PM
class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        HashSet<Integer> hSet = new HashSet<>();
        for (int i : nums) {
            hSet.add(i);
            sum += i;
        }
        double avg = sum * 1.0 / nums.length;
        int a = (int) Math.floor(avg);
        if(a<0) a=1;
        else a++;
        while (true) {
            if (!hSet.contains(a))
                break;
            a++;
        }
        return a;
    }
}