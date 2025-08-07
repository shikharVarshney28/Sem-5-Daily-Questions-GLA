// Last updated: 8/7/2025, 2:55:50 PM
class Solution {
    class Pair {
        String s;
        double val;

        Pair(String s, double values) {
            this.s = s;
            this.val = values;
        }

        public String toString() {
            return "( " + s + ", " + val + " )";
        }
    }

    public double[] calcEquation(List<List<String>> fractions, double[] values, List<List<String>> queries) {
        double answer[] = new double[queries.size()];
        HashMap<String, List<Pair>> adjLis = new HashMap<>();
        for (int i = 0; i < fractions.size(); i++) {
            List<Pair> temp;
            if (adjLis.containsKey(fractions.get(i).get(0))) {
                temp = adjLis.get(fractions.get(i).get(0));
                temp.add(new Pair(fractions.get(i).get(1), values[i]));
            } else {
                temp = new ArrayList<>();
                temp.add(new Pair(fractions.get(i).get(1), values[i]));
            }
            adjLis.put(fractions.get(i).get(0), temp);
            if (adjLis.containsKey(fractions.get(i).get(1))) {
                temp = adjLis.get(fractions.get(i).get(1));
                temp.add(new Pair(fractions.get(i).get(0), 1 / values[i]));
            } else {
                temp = new ArrayList<>();
                temp.add(new Pair(fractions.get(i).get(0), 1 / values[i]));
            }
            adjLis.put(fractions.get(i).get(1), temp);
        }
        int idx = 0;
        HashSet<String> vis = new HashSet<>();
        for (List<String> query : queries) {
            if (!adjLis.containsKey(query.get(0)) || !adjLis.containsKey(query.get(1)))
                answer[idx++] = -1.0;
            else if (query.get(0).equals(query.get(1)))
                answer[idx++] = 1.0;
            else
                answer[idx++] = dfs(query.get(0), query.get(1), adjLis, vis, 1.0);
        }
        return answer;
    }

    static double dfs(String src, String dest, HashMap<String, List<Pair>> adjLis, HashSet<String> vis, double val) {
        // {{"b","c"},{"b","a"},{"a","c"},{"c","a"},{"x","x"},{"a","y"}}
        if (src.equals(dest))
            return val;
        vis.add(src);
        double a = -1.0;
        for (Pair p : adjLis.get(src)) {
            if (vis.contains(p.s))
                continue;
            a = dfs(p.s, dest, adjLis, vis, val * p.val);
            if (a != -1.0) {
                break;
            }
        }
        vis.remove(src);
        return a;
    }
}