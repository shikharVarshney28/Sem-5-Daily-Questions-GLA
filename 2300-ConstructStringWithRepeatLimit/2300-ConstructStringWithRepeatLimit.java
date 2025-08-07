// Last updated: 8/7/2025, 2:48:01 PM
class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap <Character,Integer> hmap=new HashMap <>();
        PriorityQueue <Character> pq=new PriorityQueue <>(Collections.reverseOrder());
        for(int i=0;i<s.length();i++){
            char ch=s.charAt (i);
            hmap.put (ch,hmap.getOrDefault (ch,0)+1);
            if(!pq.contains(ch)) pq.add (ch);
        }
        StringBuilder ans=new StringBuilder ();
        while(!pq.isEmpty()){
            char ch= pq.peek();
            int freq=hmap.get (ch );
            int count=0;
            while(freq!=0){
                while(count<repeatLimit && freq!=0) {
                    ans.append(ch);
                    
                    count++;
                    freq--;
                }
                if(freq==0){
                    hmap.remove(ch);
                    pq.poll ();
                    break;
                }
                //its time to append second max char 
                pq.poll ();
                if(pq.isEmpty ()) break;
                char second=pq.peek();
                int freq2=hmap.get (second);
                ans.append(second);
                freq2--;
                if(freq2==0) {
                    hmap.remove (second);
                    pq.poll ();
                }else hmap.put (second,freq2);
                pq.add (ch);
                count=0;
            }
        }
        return ans.toString ();
    }
}