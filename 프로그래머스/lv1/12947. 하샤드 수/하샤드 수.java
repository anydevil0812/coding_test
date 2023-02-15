class Solution {
    public boolean solution(int x) {
        int num = 0;
        String text = Integer.toString(x);
        for(int i = 0; i < text.length(); i++){
            num += Integer.parseInt(String.valueOf(text.charAt(i)));
        }
        if(x % num == 0){
            return true;
        } else {
            return false;
        }
    }
}