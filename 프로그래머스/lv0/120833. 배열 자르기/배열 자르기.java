import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = num1; i <= num2; i++){
            li.add(numbers[i]);
        }
        int[] answer = li.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}