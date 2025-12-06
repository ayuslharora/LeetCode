import java.util.*;

class Solution {
    class Process {
        int pid;
        int at;
        int bt;

        Process(int pid, int at, int bt) {
            this.pid = pid;
            this.at = at;
            this.bt = bt;
        }
    }

    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        Process[] processes = new Process[n];

        for (int i = 0; i < n; i++) {
            processes[i] = new Process(i, tasks[i][0], tasks[i][1]);
        }

        Arrays.sort(processes, (a, b) -> a.at - b.at);

        PriorityQueue<Process> pq = new PriorityQueue<>((a, b) -> {
            if (a.bt != b.bt) return a.bt - b.bt;
            return a.pid - b.pid;
        });

        int[] ans = new int[n];
        int index = 0;
        int completed = 0;
        long currentTime = 0;

        while (completed < n) {
            while (index < n && processes[index].at <= currentTime) {
                pq.add(processes[index]);
                index++;
            }

            if (pq.isEmpty()) {
                currentTime = processes[index].at;
                continue;
            }

            Process p = pq.remove();
            currentTime += p.bt;
            ans[completed] = p.pid;
            completed++;
        }

        return ans;
    }
}