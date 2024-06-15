import java.util.Scanner;

public class programmers_문자열앞의n글자 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "He110W0r1d";
        int n = 5;
        String answer = s.solution(my_string, n);
        System.out.println(answer);
    }
}
class Solution {
    public String solution(String my_string, int n) { //my_string == He110W0r1d, n==5
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }
}