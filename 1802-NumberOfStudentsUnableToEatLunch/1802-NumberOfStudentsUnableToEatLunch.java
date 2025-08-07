// Last updated: 8/7/2025, 2:49:39 PM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int szero = 0, sone = 0;
        for (int i : students) {
            if (i == 0)
                szero++;
            else
                sone++;
        }
        int ans = 0;
        for (int i : sandwiches) {
            if (i == 0 && szero == 0 || i == 1 && sone == 0) {
                //the student who like the i is now empty so none studnet like the i so the circle stops here
                return students.length - ans;
            }
            if (i == 0)
                szero--; // the studnet that like it has now out of qu and the net count dec by 1
            else
                sone--;
            ans++;
        }
        return students.length - ans;
    }
}