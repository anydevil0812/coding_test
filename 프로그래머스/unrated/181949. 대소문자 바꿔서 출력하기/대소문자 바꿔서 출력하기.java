import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            char x = a.charAt(i);
            if(Character.isUpperCase(x)){
                sb.append(Character.toLowerCase(x));
            } else {
                sb.append(Character.toUpperCase(x));
            }   
        }
        System.out.println(sb);
    }
}