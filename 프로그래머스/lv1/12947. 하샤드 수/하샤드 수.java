class Solution {
	public boolean solution(int x) {
		boolean answer = true;
		int num = 0;
		int num2 = x;
        
        while(num2/10 != 0){
        	num += num2%10;
        	num2 = num2/10;
        }
        
        num += num2;
        
        if(x%num != 0)
        	answer = false;
        
        return answer;
    }
}