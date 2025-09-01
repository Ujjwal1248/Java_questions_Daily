class Solution {
    class Pair {
        int start, end;
        Pair(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if (n == 0) return 0;

        Pair[] meeting = new Pair[n];
        for (int i = 0; i < n; i++) {
            meeting[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(meeting, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = meeting[0].end;

        for (int i = 1; i < n; i++) {
            if (meeting[i].start >= lastEnd) {
                count++;
                lastEnd = meeting[i].end;
            }
        }

        return n - count;
    }
}