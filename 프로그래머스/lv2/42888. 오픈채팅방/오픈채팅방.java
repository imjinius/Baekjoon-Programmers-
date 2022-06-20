import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        int cnt = 0;
		int index = 0;
		Map<String,String> map = new HashMap<String,String>();
		
		for(String s:record){
			String[] rec = s.split(" ");
			if(rec[0].equals("Enter")){
				map.put(rec[1], rec[2]);
				cnt++;
			} else if(rec[0].equals("Leave")){
				cnt++;
			}
			if(rec[0].equals("Change")){
				if(map.get(rec[1]) != ""){
					map.replace(rec[1], rec[2]);
				}
			}
		}
		
		answer = new String[cnt];
		for(String s:record){
			String[] rec = s.split(" ");
			if(rec[0].equals("Enter")){
				answer[index] = map.get(rec[1])+"님이 들어왔습니다.";
				index++;
			} else if(rec[0].equals("Leave")){
				answer[index] = map.get(rec[1])+"님이 나갔습니다.";
				index++;
			}
			
		}
        return answer;
    }
}