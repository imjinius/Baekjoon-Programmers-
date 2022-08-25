import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> solution(int N, int[] stages) {
    	List<Integer> answer = new ArrayList<Integer>();
    	int[] count = new int[N+2];
    	int userNum = stages.length;
    	Map<Integer, Double> map = new HashMap<Integer, Double>();
    	
        for(int i=0;i<stages.length;i++){
        	count[stages[i]]++;
        }
        
        for(int i=1;i<=N;i++){
        	if(userNum == 0)
        		map.put(i, 0.0);
        	else{
        		map.put(i, ((double)count[i]/userNum));
        		userNum -= count[i];
        	}
        }
        
        List<Integer> l = new ArrayList(map.keySet());
        Collections.sort(l, (o1,o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        for(int key:l)
        	answer.add(key);
        
        return answer;
    }
}