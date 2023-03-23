import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        for(int i : arr){
            if(i % divisor == 0){
                li.add(i);
            }
        }
        if(li.isEmpty()){
            li.add(-1);
        }
        Collections.sort(li);
        return li.stream().mapToInt(i -> i).toArray();
    }
}