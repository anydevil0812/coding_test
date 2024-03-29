import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int len = words.length;
        int[] answer = new int[2];
        boolean result = true;
        ArrayList<String> li = new ArrayList<>();
        
        for(int i = 0; i < len; i++){
            if(i > 0 && words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0) 
               || li.contains(words[i])){
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                result = false;
                break;
            }
            li.add(words[i]);
        }
        if(result){
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}