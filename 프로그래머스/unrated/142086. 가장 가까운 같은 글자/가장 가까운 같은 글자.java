class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] li = new int[len];
        li[0] = -1;
        
        for(int i = 1; i < len; i++){
            char k = s.charAt(i);
            int x = s.lastIndexOf(s.substring(i, i+1), i-1);
            if(x != -1) {
                li[i] = i-x;
            }
            else{
                li[i] = x;
            }
        } 
        return li;
    }
}