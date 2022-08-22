class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] intArr = new int[10];
        
        for(int i=0;i<numbers.length;i++){
        	intArr[numbers[i]]  = 1;
        }
        
        for(int i=0;i<intArr.length;i++){
        	if(intArr[i] != 1)
        		answer += i;
        }
        
        
        return answer;
    }
}