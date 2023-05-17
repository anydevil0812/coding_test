class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        boolean even = true;
        
        for(String i : arr){
            if(even){
                sb.append(i.toUpperCase());
            } else {
                sb.append(i);
            }
            even = !even;
            if(i.equals(" ")){
               even = true;
            }  
        }       
        return sb.toString();
    }
}