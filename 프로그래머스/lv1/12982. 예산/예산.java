import java.util.*;

public class Solution {
    public int solution(int[] d, int budget) {
        ArrayList<Integer> li = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < d.length; i++){
            heap.add(d[i]);
        }
        int n = 0;
        for(int i = 0; i < d.length; i++){
            if(n + heap.peek() > budget){
                break;
            } else {
                n += heap.poll();
                li.add(n);
            }
        }
        return li.size();
    }
}