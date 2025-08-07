// Last updated: 8/7/2025, 2:58:51 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums) h.add(i);
        // kya 100 starting ele ho skta hai if 99 is absent
        int max_size=0;
        for(int numb:h)
        {
            // let numbe be the initial number
            if(h.contains(numb-1)==false)
            {
                // numb-1 is absent and numb is the starting point;
// now look for numb+1 element in set to form max consecutive sequence till numb+1 is absent and we store it to an varible for each iterations;
                int size=1; // size of each initials
                while(h.contains(numb+1))
                {
                    size++;
                    numb++;
                }
                max_size=Math.max(max_size,size);
            }
            else
            {
                // that numb is not an starting point so we continue for searching for an element to be starting point..
                continue;
            }
        }
        return max_size;
    }
}