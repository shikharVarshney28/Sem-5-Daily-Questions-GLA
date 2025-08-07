// Last updated: 8/7/2025, 2:58:53 PM
class Solution {
    ArrayList<String> find(String s,HashSet<String>hSet){
        ArrayList <String> ans=new ArrayList <>();
        for(int i=0;i<s.length();i++){
            for(char ch='a';ch<='z';ch++){
                if(s.charAt (i)==ch) continue;
                String newWord = s.substring (0,i)+ch+s.substring (i+1);
                if(hSet.contains (newWord)) ans.add (newWord);
            }
        }
        return ans;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hSet=new HashSet<>(wordList);
        HashMap<String,ArrayList<String>> hmap=new HashMap <>();
        if(!hSet.contains(endWord)) return 0;
        for(String s:wordList){
            ArrayList<String> arr=find(s,hSet);
            hmap.put (s,arr);
        }
        if(!hmap.containsKey (beginWord)){
            hmap.put(beginWord,find(beginWord,hSet));
        }
        
        Queue<String> qu=new LinkedList <>();
        qu.add (beginWord);
        int level =0;
        while(qu.size ()>0){
            int size=qu.size ();
            for(int i=0;i<size;i++){
                String s=qu.poll ();
                hSet.remove(s);
                if(s.equals (endWord)) return level+1;
                for(String neighbour:hmap.get (s)){
                    if(hSet.contains (neighbour)){
                        qu.add (neighbour);
                    }
                }
            }
            level++;

        }
        //System.out.println (hmap);
        return 0;
    }
}