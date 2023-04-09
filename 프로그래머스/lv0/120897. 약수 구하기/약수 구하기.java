import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                li.add(i);
            }
        }
        return li.stream().mapToInt(i -> i).toArray();
    }
}