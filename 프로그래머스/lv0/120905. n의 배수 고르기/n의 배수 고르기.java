import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i : numlist){
            if(i % n == 0){
                li.add(i);
            }
        }
        return li.stream().mapToInt(i -> i).toArray();
    }
}