class Solution {
    public int[] solution(String s) {
    int[] answer = new int[2];
    int zeroCount = 0, calCount = 0, len = 0;
    while (s.length() > 1) {
        zeroCount += s.chars().filter(c -> c == '0').count();
        s = s.replace("0", "");
        s = Integer.toBinaryString(s.length());
        calCount++;
    }
    answer[0] = calCount;
    answer[1] = zeroCount;
    return answer;
    }
}