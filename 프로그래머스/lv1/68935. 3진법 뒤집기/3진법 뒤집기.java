class Solution {
    public int solution(int n) {
        String a = Integer.toString(n, 3);
        char[] arr = a.toCharArray();
        String b = "";
        for(int i = arr.length - 1; i >= 0; i--){
            b += arr[i];
        }
        return Integer.parseInt(b, 3);
    }
}