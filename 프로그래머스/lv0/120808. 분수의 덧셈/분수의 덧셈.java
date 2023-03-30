class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = numer1 * denom2 + numer2 * denom1, b = denom1 * denom2;
        int x = a, y = b;
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;
        answer[0] = x / gcd;
        answer[1] = y / gcd;
        return answer;
    }
}