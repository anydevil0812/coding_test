class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] x = letter.split(" ");
        String answer = "";
        for(String i : x){
            for(int j = 0; j < morse.length; j++){
                if(i.equals(morse[j])){
                    answer += Character.toString(j + 'a');
                    break;
                }
            }
        }
        return answer;
    }
}