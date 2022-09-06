import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        
    	for(int i=0;i<arr.length;i++){
    		answer.add(arr[i]);
    	}
        
        if(arr.length <= 1){
        	answer.remove(0);
        	answer.add(-1);
        } else {
        	Integer minValue = Arrays.stream(arr).min().getAsInt();
        	answer.remove(answer.indexOf(minValue));
        }
        
        return answer;
    }
}