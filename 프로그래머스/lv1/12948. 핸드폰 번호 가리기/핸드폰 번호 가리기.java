public class Solution {
    public String solution(String phoneNumber) {
        int len = phoneNumber.length();
        String answer = phoneNumber.replaceAll(phoneNumber.substring(0, len - 4), 
                                               "*".repeat(len - 4));
        return answer;
    }
}