import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static int[] solution(String s) {
        int[] answer = {};
        int zero = 0;
        int transfer = 0;
        String[] strArr = s.split("");
        List<String> list = new ArrayList<>();
        
        while(strArr.length > 1){
        	transfer++;
        	Collections.addAll(list, strArr);
        	for(int i=0;i<list.size();i++){
        		if(Integer.parseInt(list.get(i)) == 0){
        			list.remove(i);
        			zero++;
        			i--;
        		}
        	}
        	
        	strArr = Integer.toBinaryString(list.size()).split("");
        	list.clear();
        }
        
        answer = new int[]{transfer,zero};
        
        
        return answer;
    }
}