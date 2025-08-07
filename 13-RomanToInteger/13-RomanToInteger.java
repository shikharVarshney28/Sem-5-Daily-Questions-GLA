// Last updated: 8/7/2025, 3:01:06 PM
class Solution {
    public int romanToInt(String roman) {
        HashMap<Character,Integer> hmap=new HashMap<>();
                hmap.put('I',1);
                        hmap.put('V',5);
                                hmap.put('X',10);
                                        hmap.put('L',50);
                                                hmap.put('C',100);
                                                        hmap.put('D',500);
                                                                hmap.put('M',1000);
                                                                        int sum=0,prev=0;
                                                                                for(int i=roman.length()-1;i>=0;i--)
                                                                                        {
                                                                                                    int k=hmap.get(roman.charAt(i));
                                                                                                                
                                                                                                                            if(k<prev) sum-=k;
                                                                                                                                        else sum+=k;
                                                                                                                                                    prev=k;
                                                                                                                                                            }
                                                                                                                                                                    return sum;
    }
}