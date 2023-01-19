class Solution {
    public int solution(String t, String p) {
    int len = p.length();
    Long b = Long.parseLong(p);
    int answer = 0;   
    
    for(int i=0; i < t.length()-len+1; i++){
        String a = t.substring(i, i+len);
        Long num = Long.parseLong(a);
        if(num <= b) {
            answer++;
        }
    }
    return answer;
 }
}