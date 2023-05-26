import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        double i = incline(dots[0], dots[1]);
        double j = incline(dots[2], dots[3]);
        if(i == j){
            return 1;
        } else {
            return 0;
        }
    }
    
    public double incline(int[] a, int[] b) {
        double x = (double) Math.abs(a[0] - b[0]);
        double y = (double) Math.abs(a[1] - b[1]);
        return y / x;
    }
}