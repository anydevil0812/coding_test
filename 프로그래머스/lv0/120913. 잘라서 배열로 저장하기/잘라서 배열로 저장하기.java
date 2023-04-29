class Solution {
    public String[] solution(String my_str, int n) {
        int num = 0;
        int len = my_str.length();
        if(len % n == 0){
            num = my_str.length() / n;
        } else {
            num = my_str.length() / n + 1;
        }
        String[] answer = new String[num];
        for(int i = 0; i < num; i++){
            if(i != num - 1){
                answer[i] = my_str.substring(n*i, n*(i+1));
            } else {
                answer[i] = my_str.substring(n*i);
            }
        }
        return answer;
    }
}