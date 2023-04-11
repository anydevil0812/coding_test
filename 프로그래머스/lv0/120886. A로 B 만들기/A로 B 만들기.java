class Solution {
    public int solution(String before, String after) {
        for(int i = 0; i < before.length(); i++){
            String x = Character.toString(before.charAt(i));
            if(after.contains(x)){
                after = after.replaceFirst(x, "");
            } else{
                return 0;
            }
        }
        return 1;
    }
}