import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int rest = Arrays.stream(sides).sum() - max;
        return rest > max ? 1 : 2;
    }
}