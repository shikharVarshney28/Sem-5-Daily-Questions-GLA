// Last updated: 8/7/2025, 2:56:48 PM
class Solution {
    static HashMap<Integer, String> hmap = hmap = new HashMap<>();;

    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        hmap.put(10, "Ten");
        hmap.put(20, "Twenty");
        hmap.put(30, "Thirty");
        hmap.put(40, "Forty");
        hmap.put(50, "Fifty");
        hmap.put(60, "Sixty");
        hmap.put(70, "Seventy");
        hmap.put(80, "Eighty");
        hmap.put(90, "Ninety");
        hmap.put(100, "Hundred");

        hmap.put(1, "One");
        hmap.put(2, "Two");
        hmap.put(3, "Three");
        hmap.put(4, "Four");
        hmap.put(5, "Five");
        hmap.put(6, "Six");
        hmap.put(7, "Seven");
        hmap.put(8, "Eight");
        hmap.put(9, "Nine");

        hmap.put(11, "Eleven");
        hmap.put(12, "Twelve");
        hmap.put(13, "Thirteen");
        hmap.put(14, "Fourteen");
        hmap.put(15, "Fifteen");
        hmap.put(16, "Sixteen");
        hmap.put(17, "Seventeen");
        hmap.put(18, "Eighteen");
        hmap.put(19, "Nineteen");
        hmap.put(0, "Zero");
        return (find(num).trim());
    }

    private static String find(int num) {
        String placeValue[] = { "", "Thousand", "Million", "Billion" };
        String word = "";
        int idx = 0;
        while (num != 0) {
            if (num % 1000 == 0) {
                num /= 1000;
                idx++;
                continue;
            }
            word = findWord(num % 1000) + " " + placeValue[idx++] + " " + word;
            num /= 1000;
        }
        return word;
    }

    private static String findWord(int i) {
        int tensOnes = i % 100;
        int hundred = i / 100;
        if (tensOnes == 0)
            return hmap.get(hundred) + " Hundred";
        String ans = "" + (hmap.containsKey(tensOnes) ? hmap.get(tensOnes)
                : hmap.get(tensOnes / 10 * 10) + " " + hmap.get(tensOnes % 10));
        return hundred == 0 ? ans : hmap.get(hundred) + " Hundred " + ans;
    }
}