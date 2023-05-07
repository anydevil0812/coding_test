import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> li = new ArrayList<>();
        int i = 1;
        while(li.size() != 100){
            if(String.valueOf(i).contains("3") || i % 3 == 0){
                i++;
                continue;
            } else{
                li.add(i++);
            }
        }
        return li.get(n-1);
    }
}