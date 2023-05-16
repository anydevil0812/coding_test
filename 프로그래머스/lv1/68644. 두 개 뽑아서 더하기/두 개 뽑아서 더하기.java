import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i == j){
                    continue;
                }
                int a = numbers[i] + numbers[j];
                if(!li.contains(a)){
                    li.add(a);
                } 
            }
        }
        return li.stream().sorted().mapToInt(i -> i).toArray();
    }
}