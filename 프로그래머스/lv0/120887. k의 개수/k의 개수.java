import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x = i; x <= j; x++){
            String p = String.valueOf(x);
            for(int a = 0; a < p.length(); a++){
                if(k == Character.getNumericValue(p.charAt(a))){
                    answer++;
                }
            }
        }        
        return answer;
    }
}