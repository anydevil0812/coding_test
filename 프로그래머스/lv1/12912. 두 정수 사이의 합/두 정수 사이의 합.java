class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int k = a;
            a = b;
            b = k;
        } 
        for(int i = a; i < b + 1; i++){
            answer += i;
        }
        return answer;
    }
}