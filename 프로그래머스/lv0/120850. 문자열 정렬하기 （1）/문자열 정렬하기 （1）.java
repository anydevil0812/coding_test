import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] a = my_string.toCharArray();
        ArrayList<Integer> li = new ArrayList<>();
        for(char i : a){
            if(Character.isDigit(i)){
                li.add(Character.getNumericValue(i));
            }
        }
        Collections.sort(li); 
        return li.stream().mapToInt(i -> i).toArray();
    }
}