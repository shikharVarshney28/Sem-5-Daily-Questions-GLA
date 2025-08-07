// Last updated: 8/7/2025, 2:48:23 PM
class Solution {
    List<Integer> ans = new ArrayList<>();

    boolean isPresentAfter(int arr[], int src, int i, boolean use[]) {
        for (int j = i + 1; j < arr.length; j++) {
            if (src == arr[j] && !use[j])
                return true;
        }
        return false;
    }

    void find(int[] digits, int num, int len, boolean use[]) {
        if (len > 3)
            return;
        if (num >= 100 && num <= 999 && num % 2 == 0 && !ans.contains(num)) {
            ans.add(num);
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if (use[i])
                continue;
            if (len == 0 && digits[i] == 0)
                continue;
            if (isPresentAfter(digits, digits[i], i, use))
                continue;
            use[i] = true;
            find(digits, num * 10 + digits[i], len + 1, use);
            use[i] = false;
        }
    }

    public int[] findEvenNumbers(int[] digits) {
        boolean use[] = new boolean[digits.length];
        Arrays.sort(digits);
        find(digits, 0, 0, use);
        int arr[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
