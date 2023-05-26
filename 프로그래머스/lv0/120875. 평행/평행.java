import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        if (incline(dots[0], dots[1]) == incline(dots[2], dots[3])){
            return 1;
        } else if (incline(dots[0], dots[2]) == incline(dots[1], dots[3])){
            return 1;
        } else if (incline(dots[0], dots[3]) == incline(dots[1], dots[2])){
            return 1;
        }
        return 0;
    }
    
    public double incline(int[] a, int[] b) {
        double x = (double) Math.abs(a[0] - b[0]);
        double y = (double) Math.abs(a[1] - b[1]);
        return y / x;
    }
}