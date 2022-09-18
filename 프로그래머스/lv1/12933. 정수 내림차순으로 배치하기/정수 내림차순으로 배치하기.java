import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        
        String[] strArr = s.split("");
        Arrays.sort(strArr,Collections.reverseOrder());
        s = String.join("", strArr);
        
        answer = Long.parseLong(s);
        
        return answer;
    }
}