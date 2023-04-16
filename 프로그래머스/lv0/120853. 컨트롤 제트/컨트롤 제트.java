class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            if(arr[i+1].equals("Z")){
                arr[i] = "0";
                arr[i+1] = "0";
            }
        }
        int answer = 0;
        for(int j = 0; j < len; j++){
            answer += Integer.parseInt(arr[j]);
        }
        return answer;
    }
}