import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>();
        
        while(n/10 != 0){
        	answer.add((int)(n%10));
        	n = n/10;
        }
        
        answer.add((int)n);
        
        return answer;
    }
}