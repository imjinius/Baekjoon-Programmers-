class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int sum = 45;
        
        for(int i:numbers)
        	sum -= i;
        
        answer = sum;
        
        return answer;
    }
}