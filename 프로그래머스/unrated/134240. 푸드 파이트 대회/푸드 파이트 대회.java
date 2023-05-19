class Solution {
    public String solution(int[] food) {
        StringBuilder sb1 = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int a = food[i] / 2;
            sb1.append(String.valueOf(i).repeat(a));
        }
        String answer = sb1.toString() + "0" + sb1.reverse().toString();
        return answer;
    }
}