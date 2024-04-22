import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ;

        Solution s = new Solution();
        System.out.println(s.solution(9,2,1,3));
    }
}

class Solution {
    public String solution(int numer1, int denom1, int numer2, int denom2) {
        int resNumer = denom1 * numer2 + denom2 * numer1;
        int resDenom = denom1 * denom2;


        for (int i = 2; i <= resNumer + resDenom; i++) {
            if (resNumer % i == 0 && resDenom % i == 0) {
                resNumer /= i;
                resDenom /= i;

                i = 2;
            }
        }
        if (resNumer % 2 == 0 && resDenom % 2 == 0) {
            resNumer /= 2;
            resDenom /= 2;
        }
        int[] answer = {resNumer, resDenom};

        return Arrays.toString(answer);
    }
}