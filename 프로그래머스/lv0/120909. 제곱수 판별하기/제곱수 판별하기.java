class Solution {
    public int solution(int n) {
        double a = Math.sqrt(n);
        return (a == (int)a) ? 1 : 2;
    }
}