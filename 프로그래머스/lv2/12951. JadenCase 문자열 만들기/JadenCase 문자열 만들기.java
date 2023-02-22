import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        if (!Character.isDigit(chars[0])) {
        chars[0] = Character.toUpperCase(chars[0]);
        }
        for(int i = 1; i < chars.length; i++) {
        if(chars[i - 1] == ' ' && !Character.isDigit(chars[i])) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
    }
    return new String(chars);
    }
}