class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        for(String i : goal){
            if(cards1.length > a && i.equals(cards1[a])){
                a++;
            }else if(cards2.length > b && i.equals(cards2[b])){
                b++;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}