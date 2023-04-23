class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;
        for(int i = 4; i <= n; i++){
            for(int j = 1; j <=n; j++){
                if(i < j){
                    break;
                } else {
                    if(i % j == 0){
                        count++;
                        if(count == 3){
                            answer++;
                            count = 0;
                            break;
                      }
                    }
                }
            }
        }
        return answer;
    }
}