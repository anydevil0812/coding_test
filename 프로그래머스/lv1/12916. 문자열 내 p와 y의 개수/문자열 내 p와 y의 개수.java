class Solution {
    boolean solution(String s) {
        int a = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.toLowerCase(s.charAt(i)) == 'p'){
                a++;
            } else if(Character.toLowerCase(s.charAt(i)) == 'y'){
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