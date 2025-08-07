// Last updated: 8/7/2025, 2:51:42 PM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); //reason below
        HashSet<String> hSet = new HashSet<>();
        for (String s : folder) {
            int idx = findFirstSlash(s);
            String part1 = s.substring(0, idx);
            while (part1.length() != 0 && !hSet.contains(part1)) {
                part1 = part1.substring(0, findFirstSlash(part1));
            }
            if (part1.length() == 0)
                hSet.add(s);
        }
        return new ArrayList<>(hSet);
    }

    int findFirstSlash(String s) {
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) == '/')
                return i;
        return -1;
    }
}

// for test case : ["/ah/al/am","/ah/al"]o/p(withou sort): ["/ah/al/am","/ah/al"] req : ["/ah/al"] bcz of the higher length string occured first