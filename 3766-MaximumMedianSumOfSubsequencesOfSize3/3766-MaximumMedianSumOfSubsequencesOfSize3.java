// Last updated: 8/7/2025, 2:43:43 PM
// we have to fill the 3 spots where the center need to be max thus the possible spot will be Min(Mini<Max) , Max , Min(Maxi>Max) now how to fill the spots..?

// first keep the count of numbsers and the unique numbers(in list)
//sortvteh list place min and max pointer on the 0 and l.size()-1res

// fill the spot a with the min and move the pointer iff the coung of that number is zero thus remove it from hmap

// Now fill the c spot with max ele if the count is zero remove from hmap and dec the pointer
// Now fill b with agian max pointer and do same....this order is done bcz if b is max then c spot shld be equla or grater than b spot....and if the count of max is one amd we fill it to b so c will be able to get filled...so fill c first and if teh freq is not one than fill the b spot with other otherwise go for second Max ele ..

class Solution {
    public long maximumMedianSum(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i : nums) {
            if (hmap.containsKey(i))
                hmap.put(i, hmap.get(i) + 1);
            else {
                hmap.put(i, 1);
                l.add(i);
            }
        }
        long ans = 0;
        //sort the list
        Collections.sort(l);
        int max = l.size() - 1, min = 0;
        while (hmap.size() > 0) {
            int a, b, c;
            a = l.get(min);
            hmap.put(a, hmap.get(a) - 1);
            if (hmap.get(a) == 0) {
                hmap.remove(a);
                min++;
            }
            c = l.get(max);
            hmap.put(c, hmap.get(c) - 1);
            if (hmap.get(c) == 0) {
                hmap.remove(c);
                max--;
            }
            b = l.get(max);
            hmap.put(b, hmap.get(b) - 1);
            if (hmap.get(b) == 0) {
                hmap.remove(b);
                max--;
            }
            ans += b;
        }
        return ans;
    }
}