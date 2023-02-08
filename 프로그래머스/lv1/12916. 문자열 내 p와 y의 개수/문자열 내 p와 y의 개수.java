class Solution {
    boolean solution(String s) {
        int a = 0;
        int b = 0;
        String string = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(string.charAt(i) == 'p'){
                a++;
            } else if(string.charAt(i) == 'y'){
                b++;
            }
        }
        if(a == b){
            return true;
        } else{
            return false;
        }
    }
}