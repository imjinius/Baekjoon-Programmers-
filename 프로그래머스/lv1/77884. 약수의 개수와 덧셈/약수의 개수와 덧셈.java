import java.util.TreeSet;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left;i<=right;i++){
        	
        	int root = (int) Math.sqrt(i);
        	TreeSet<Integer> ts = new TreeSet<>();
        	
        	for(int j=1;j<=root;j++){
        		if(i%j == 0){
        			ts.add(j);
        			ts.add(i/j);
        		}
        	}
        	
        	if(ts.size()%2 == 0)
        		answer += i;
        	else
        		answer -= i;
        	
        }
        
        return answer;
    }
}