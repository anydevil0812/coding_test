class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] answer  = new String[len];
        for(int i = 0; i < len; i++){
            String[] arr = quiz[i].split(" ");
            int x = 0;
            if(arr[1].equals("+")){
                x = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            } else {
                x = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            }
            if(x == Integer.parseInt(arr[4])){
                answer[i] = "O";
            } else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}