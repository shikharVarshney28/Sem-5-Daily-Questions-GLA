// Last updated: 8/7/2025, 2:47:53 PM
class Solution {
    int arr[] = { 1, 5, 15, 60 };

    int convert(int hr, int min) {
        //min---> 00
        int idx = 3;
        int steps = 0;
        while (min > 0) {
            if (min < arr[idx])
                idx--;
            else {
                steps += (min / arr[idx]);
                min %= arr[idx];
            }
        }
        // System.out.println(steps);
        return steps;
    }

    public int convertTime(String current, String correct) {
        String inctime[] = current.split(":");
        String ctime[] = correct.split(":");
        int hr = Integer.parseInt(inctime[0]), min = Integer.parseInt(inctime[1]), reqhr = Integer.parseInt(ctime[0]),
                reqmin = Integer.parseInt(ctime[1]);
        int time = 0;
        if (min > reqmin) { // to convert :30 to :15 ---> :30 to :00 first
            time += convert(hr, 60-min+reqmin); // to convert 9:41 --> 10:34 (7)
            min = reqmin; // now time will be in formate :00
            hr++;
        }
        //convert the min into reqmin;
        int idx = 4;
        time += convert(hr, reqmin - min); // since min<reqmin
        time += reqhr - hr; //hr conversion

        return time;
    }
}