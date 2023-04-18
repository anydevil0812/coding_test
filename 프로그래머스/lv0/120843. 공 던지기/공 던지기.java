class Solution {
    public int solution(int[] numbers, int k) {
        int num = 2 * (k-1);
        int index = num % numbers.length;
        return numbers[index];
    }
}