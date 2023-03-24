class Solution {
    public int solution(int n, int k) {
        int a = n / 10;
        k -= a;
        int answer = n * 12000 + k * 2000;
        return answer;
    }
}