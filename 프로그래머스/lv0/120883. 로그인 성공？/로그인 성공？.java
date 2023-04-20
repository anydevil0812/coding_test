class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for(String[] i : db){
            if(id.equals(i[0])){
                if(pw.equals(i[1])){
                    return "login";
                } else{
                    return "wrong pw";
                }
            } else {
                continue;
            }
        }
        return "fail";
    }
}