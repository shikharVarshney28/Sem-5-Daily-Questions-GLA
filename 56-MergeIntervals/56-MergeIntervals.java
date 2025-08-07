// Last updated: 8/7/2025, 3:00:09 PM
class Solution {
    public int[][] merge(int[][] intervals) {

        int freq[] = new int[10001];
        //to Track the number which has PARITICIPATE in opr i.i.e start and end
        boolean vis[]=new boolean[freq.length];
        int st = 10001, end = -1;
        for (int i[] : intervals) {
            st = Math.min(st, i[0]);
            end = Math.max(end, i[1]);
            freq[i[0]]++;
            freq[i[1]]--;
            vis[i[0]]=true;
            vis[i[1]]=true;
        }
        int count = 0;
        List<int[]> arr = new ArrayList<>();
        int temp[] = new int[2];
        for (int i = st; i <= end; i++) {
            // if the number i is not there in interval i.i.e it is neither start or end and its possible its count is zero so to avoid the element not in range we skip...
            // thus if the above cond is false so if fre[i]==0 then uts the only case iff start == end else freq[i] will be positive or negative but not 0...
             if(!vis[i]) continue;
            if (freq[i] >= 0 && count == 0) {
                temp[0] = i;
            }
            count += freq[i];
            if (count == 0) {
                temp[1] = i;
                arr.add(new int[] { temp[0], temp[1] });
            }
        }
        int ans[][] = new int[arr.size()][2];
        int idx = 0;
        for (int[] i : arr) {
            ans[idx][0] = i[0];
            ans[idx][1] = i[1];
            idx++;
        }
        return ans;
    }
}