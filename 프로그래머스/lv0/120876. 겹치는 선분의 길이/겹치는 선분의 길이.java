class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[200];
        for(int[] line : lines) {
            for(int i = line[0] + 100; i < line[1] + 100; i++) {
                arr[i]++;
            }
        }
        
        int answer = 0;
        for(int value : arr) {
            if(value > 1){
              answer++;  
            } 
        }
        return answer;
    }
}