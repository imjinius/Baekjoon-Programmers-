class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        char[] c = s.toCharArray();
        
        for(int i=0;i<c.length;i++){
        	if(c[i]==80 || c[i]==112)
        		p++;
        	else if(c[i]==89 || c[i]==121)
        		y++;
        }
        
        if(p==0 && y==0 || p==y)
        	answer = true;
        else if(p!=y)
        	answer = false;

        return answer;
    }
}