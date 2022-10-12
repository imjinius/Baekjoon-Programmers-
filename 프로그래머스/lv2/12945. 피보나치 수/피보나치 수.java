class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] intArr = new int[1000001];
        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 1;
        
        for(int i=2;i<n;i++)
        	intArr[i+1] = ((intArr[i]%1234567)+(intArr[i-1]%1234567))%1234567;
        
        answer = intArr[n];
        
        return answer;
    }
}