class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
	        int left = 10;
	        int right = 12;
	        
	        
	        for(int i=0;i<numbers.length;i++){
	        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
	        		sb.append("L");
	        		left = numbers[i];
	        	}
	        	else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
	        		sb.append("R");
	        		right = numbers[i];
	        	}
	        	
	        	else if(numbers[i]==2 || numbers[i]==5 || numbers[i]==8 || numbers[i] == 0){
	        		if(numbers[i] == 0){
	        			numbers[i] = 11;
	        		}
	        		
	        		
	        		int ldistance = Math.abs(numbers[i] - left)/3 + Math.abs(numbers[i] - left)%3;
	        		int rdistance = Math.abs(numbers[i] - right)/3 + Math.abs(numbers[i] - right)%3;
	        		
	        		if(ldistance>rdistance){
	        			sb.append("R");
	        			right = numbers[i];	        			
	        		}
	        		else if(rdistance>ldistance){
	        			sb.append("L");
	        			left = numbers[i];
	        		}
	        		else if(rdistance == ldistance){
	        			if(hand.equals("right")){
	        				sb.append("R");
	        				right = numbers[i];
	        			}
	        			else{
	        				sb.append("L");
	        				left = numbers[i];
	        			}
	        		}
	        		
	        	} 
	        		
	        }
	        
	        answer = sb.toString();
        return answer;
    }
}