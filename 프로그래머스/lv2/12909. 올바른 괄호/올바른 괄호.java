import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Integer> stack = new Stack<>();
        
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 40)
				stack.add(1);
			else {
				if(stack.empty()){
					answer = false;
					break;
				}
				else
					stack.pop();
			}
		}
        
        
        if(!stack.empty())
        	answer = false;
        
        return answer;
    }
}