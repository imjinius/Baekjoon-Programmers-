import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> s = new HashSet<>();
        
        for(int i:nums){
        	s.add(i);
        	if(s.size() == nums.length/2){
        		answer = nums.length/2;
        		break;
        	}
        }
        
        if(answer == 0)
        	answer = s.size();
        
        return answer;
    }
}