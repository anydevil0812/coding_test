import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int i = 2;
        while(n > 1){
            if(n % i == 0){
                li.add(i);
                n /= i;
            } else{
                i++;
            }
        }
        return li.stream().distinct().mapToInt(a -> a).toArray();
    }
}