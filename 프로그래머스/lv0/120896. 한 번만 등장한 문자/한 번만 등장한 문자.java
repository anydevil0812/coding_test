import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        String x = "";
        for(char i : arr) {
            if(!x.contains(String.valueOf(i))){
                x += i;
            } 
		}
        
        String answer = "";
        for(int j = 0; j < x.length(); j++){
            char a = x.charAt(j);
            int ix = s.indexOf(a);
            if(s.indexOf(a, ix+1) == -1){
                answer += a;
            }
        }
        
        char[] c = answer.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}