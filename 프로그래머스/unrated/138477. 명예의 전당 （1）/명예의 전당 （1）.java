import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i = 0; i < len; i++){
            if(heap.size() == k){
                if(heap.peek() < score[i]){
                    heap.poll();
                    heap.add(score[i]);
                } 
            } else {
                heap.add(score[i]);
            }
            answer[i] = heap.peek();
        }
        
        return answer;
    }
}