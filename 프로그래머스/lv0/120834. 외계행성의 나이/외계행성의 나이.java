class Solution {
    public String solution(int age) {
        String answer = "";
        String num = String.valueOf(age);
        for(int i = 0; i < num.length(); i++){
            char x = num.charAt(i);
            String y = x == '0' ? "a" : x == '1' ? "b" : x == '2' ? "c" : x == '3' ? "d" : x == '4' ? "e" : x == '5' ? "f" : x == '6' ? "g" : x == '7' ? "h" : x == '8' ? "i" : "j";
            answer += y;
        }
        return answer;
    }
}