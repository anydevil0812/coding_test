import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int w = 0, h = 0;
        for(int[] i : dots){
            for(int[] j : dots){
                if(i == j){
                    continue;
                }
                if(i[0] == j[0]){
                    h += Math.abs(i[1] - j[1]);
                } else if(i[1] == j[1]){
                    w += Math.abs(i[0] - j[0]);
                }
            }
        }
        int answer = w * h / 16;
        return answer;
    }
}