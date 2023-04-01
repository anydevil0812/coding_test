class Solution {
    public int solution(int hp) {
        int a = hp / 5;
        hp -= 5 * a;
        int b = hp / 3;
        hp -= 3 * b;
        return a + b + hp;
    }
}