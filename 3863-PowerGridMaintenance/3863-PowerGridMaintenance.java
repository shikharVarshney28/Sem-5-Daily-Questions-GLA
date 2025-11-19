// Last updated: 11/19/2025, 12:33:42 PM
class Solution {
    class D{
        int parent[];
        int rank[];
        D(int n){
            parent=new int[n+1];
            rank = new int[n+1];
            for(int i=0;i<=n;i++) parent[i] = i;
        }
        int find(int a){
            if(parent[a] == a) return a;
            return parent[a] = find(parent[a]);
        }

        int union(int a,int b){
            int A = find(a);
            int B = find(b);
            int pA = Math.min(A,B);
            int pB = Math.max(A,B);
            if(pA == pB) return pA;
            if(rank[pA]>rank[pB]){
                parent[pB] = pA;
                return pA;
            }
            else if(rank[pA] == rank[pB]){
                parent[pB] = pA;
                rank[pA]++;
                return pA;
            }else{
                parent[pA] = pB;
                return pB;
            }   
        }

    }
    HashMap<Integer,TreeSet<Integer>> hmap;
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        hmap = new HashMap<>();
        int ans[];
        D d = new D(c);
        for(int i[]:connections){
            int parent = d.union(Math.min(i[0],i[1]),Math.max(i[0],i[1]));
            //System.out.println(i[0]+" "+i[1]+" "+parent);
            TreeSet<Integer> arr;
            if(hmap.containsKey(parent)){
                arr = hmap.get(parent);
            }else arr = new TreeSet<>();
            arr.add(i[0]);
            arr.add(i[1]);
            hmap.put(parent,arr);
        }
        for(int i=1;i<=c;i++){
            int parent = d.find(i);
            TreeSet<Integer> arr;
            if(hmap.containsKey(parent)) arr = hmap.get(parent);
            else arr = new TreeSet<>();
            arr.add(i);
            hmap.put(parent,arr);
        }
        //System.out.println(hmap);
        boolean working[]=new boolean[c+1];
        Arrays.fill(working,true);
        List<Integer> arr = new ArrayList<>();
        for(int i[]:queries){
            if(i[0] == 1){
                int station = i[1];
                if(working[station]){
                    arr.add(station);
                }else{
                    int p = d.parent[station];
                    if(hmap.containsKey(p) && hmap.get(p).size()>0) arr.add(hmap.get(p).first());
                    else arr.add(-1);
                }
            }else{
                int station=i[1];
                working[station] = false;
                int p = d.parent[station];
                if(hmap.containsKey(p) && hmap.get(p).contains(station)) hmap.get(p).remove(station);
            }
            //System.out.println(hmap);
        }
        ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        return ans;
    }
}