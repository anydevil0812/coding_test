class Solution {
    public String solution(String my_string, int num1, int num2) {
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        char[] word = my_string.toCharArray();
        word[num1] = b;
        word[num2] = a;
        return new String(word);
    }
}