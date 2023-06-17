class Solution {
    public int solution(int n) {
        int a = n + 1;
        while (Integer.bitCount(n) != Integer.bitCount(a)) {
            a++;
        }
        return a;
    }
}
