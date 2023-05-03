class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" ");
        int a = 0, b = 0;
        for(int i = 0; i < arr.length; i += 2){
            if(arr[i].equals("x")){
                a += 1;
            } else if(arr[i].contains("x")){
                a += Integer.parseInt(arr[i].replace("x", ""));
            }
              else if(!arr[i].contains("x")){
                b += Integer.parseInt(arr[i]);
            }
        }
        String answer = "";
        if(a == 0 && b == 0){
            return "0";
        } else if(a == 0){
            answer += String.valueOf(b);
        } else if(b == 0){
            answer += (a == 1) ? "x" : String.valueOf(a) + "x";
        } else{
            answer += (a == 1) ? "x + " : String.valueOf(a) + "x + ";
            answer += String.valueOf(b);
        }
        return answer;
    }
}