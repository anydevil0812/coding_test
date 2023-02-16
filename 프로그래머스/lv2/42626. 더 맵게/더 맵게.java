import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            heap.add(scoville[i]);
        }
        
        int answer = 0;
        while(heap.peek() < K){
            if(heap.size() < 2){
                answer = -1;
                break;
            }
            int a = heap.poll();
            int b = heap.poll();
            int newScoville = a + b * 2;
            heap.add(newScoville);
            answer++;
        }
        return answer;
    }
}