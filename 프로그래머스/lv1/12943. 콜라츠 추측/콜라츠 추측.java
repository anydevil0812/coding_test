class Solution {
    public int solution(int num) {
        if(num == 1){
            return 0;
        }
        Long a = Long.valueOf(num);
        int answer = 0;
        while(a != 1){
            if(a % 2 == 0){
                a = a / 2;
            } else {
                a = 3 * a + 1;
            }
            answer++;
            if(answer == 500){
                return -1;
            }
        }
        return answer;
    }
}