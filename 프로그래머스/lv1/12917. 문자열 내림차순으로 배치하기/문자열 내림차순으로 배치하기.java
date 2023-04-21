import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        String a = "", b = "";
        for(char i : arr){
            if(Character.isLowerCase(i)){
                a += i;
            } else {
                b += i;
            }
        }
        
        String answer = "";
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i = c.length - 1; i >= 0; i--){
            answer += c[i];
        }
        for(int j = d.length - 1; j >= 0; j--){
            answer += d[j];
        }
        return answer;
    }
}