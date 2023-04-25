class Solution {
    public int solution(String[] spell, String[] dic) {
        int len = spell.length;
        for(String word : dic){
            int a = 0;
            for(String c : spell){
                if(word.contains(c)){
                    a++;
                    if(a == len){
                        return 1;
                    }
                } else {
                    continue;
                };
            }
        }
        return 2;
    }
}