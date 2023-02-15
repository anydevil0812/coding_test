import java.util.*;

public class Solution {
    public int solution(int[] d, int budget) {
        List<Integer> a = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < d.length; i++) {
            heap.offer(d[i]);
        }
        int b = 0;
        while (!heap.isEmpty()) {
            if (b + heap.peek() > budget) {
                break;
            } else {
                b += heap.poll();
                a.add(b);
            }
        }
        return a.size();
    }
}