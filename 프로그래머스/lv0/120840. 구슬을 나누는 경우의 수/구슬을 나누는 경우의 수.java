import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        for(long i = balls; i > balls - share; i--){
            a = a.multiply(BigInteger.valueOf(i));
        }
        for(long j = 1; j <= share; j++){
            b = b.multiply(BigInteger.valueOf(j));
        }
        return a.divide(b).intValue();
    }
}