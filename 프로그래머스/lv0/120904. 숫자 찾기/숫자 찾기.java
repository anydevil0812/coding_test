class Solution {
    public int solution(int num, int k) {
        String a = Integer.toString(num);
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == Character.forDigit(k, 10)){
                return i + 1;
            }
        }
        return -1;
    }
}