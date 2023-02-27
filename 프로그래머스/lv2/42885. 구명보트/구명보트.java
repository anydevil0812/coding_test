import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> li = new ArrayDeque<>();
        for(int i : people){
            li.add(i);
        }
        
        int answer = 0;
        while(!li.isEmpty()){
            if(li.size() == 1){
                answer++;
                break;
            }
            if(li.getFirst() + li.getLast() <= limit){
                li.removeFirst();
                li.removeLast();
            } else {
                li.removeLast();
            }
            answer++;
        }
        return answer;
    }
}