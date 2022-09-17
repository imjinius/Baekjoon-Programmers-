class Solution {
    public long solution(long n) {
        long answer = -1;
        long n1 = (long) Math.sqrt(n);
        
        if(n1*n1 == n)
        	answer = (long)Math.pow(n1+1, 2);
        
        return answer;
    }
}