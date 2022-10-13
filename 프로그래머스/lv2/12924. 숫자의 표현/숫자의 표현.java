class Solution {
	public static int solution(int n) {
        int answer = 0;
        int num = 0;
        
        for(int i=1;i<=n;i++){
        	int sum = 0;
        	boolean flag = false;
        	num = i;
        	while(true){
        		sum += num;
        		num++;
        		if(sum == n){
        			flag = true;
        			break;
        		} else if(sum > n)
        			break;
        	}
        	if(flag == true)
        		answer++;
        }
        
        return answer;
    }
}