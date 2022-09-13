import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int n1 = 10;
        
        while(true){
        	int n2 = n%n1;
        	answer += n2/(n1/10);
        	if(n/n1 == 0)
        		break;
        	else
        		n1 *= 10;
        }
        

        return answer;
    }
    
}