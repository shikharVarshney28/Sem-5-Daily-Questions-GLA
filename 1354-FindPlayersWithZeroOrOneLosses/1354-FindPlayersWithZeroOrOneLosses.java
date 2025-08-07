// Last updated: 8/7/2025, 2:51:40 PM
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> winner=new HashSet<>();
        HashSet<Integer> loserOne=new HashSet<>();
        HashSet<Integer> loser=new HashSet<>();
        for(int [] match: matches){
            // conditions to be a winner
            if(!loserOne.contains(match[0]) && !loser.contains(match[0])) winner.add(match[0]);
            if(winner.contains(match[1])){
                winner.remove(match[1]);
            }
            if(!loserOne.contains(match[1]) && ! loser.contains(match[1])) loserOne.add(match[1]);
            else{
                loserOne.remove (match[1]);
                loser.add (match [1]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for(int win:winner) temp.add(win);
        Collections.sort(temp);
        ans.add (temp);
        temp=new ArrayList<>();
        for(int lose:loserOne) temp.add(lose);
        Collections.sort(temp);
        ans.add(temp);
        return ans;
    }
}