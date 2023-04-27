class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int len = my_string.length();
        String num = "";
        for(int i = 0; i < len; i++){
            char a = my_string.charAt(i);
            if(Character.isDigit(a)){
                if(i == len - 1){
                    num += a;
                    answer += Integer.parseInt(num);
                } else{
                    num += a;
                }
            }else{
                if(num.length() != 0){
                    answer += Integer.parseInt(num);
                num = "";
                }
            }
        }
        return answer;
    }
}