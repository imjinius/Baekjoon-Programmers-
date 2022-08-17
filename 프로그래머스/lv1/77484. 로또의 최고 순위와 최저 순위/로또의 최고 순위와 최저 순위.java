class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int win = 0;
        
        for(int i=0;i<lottos.length;i++){
        	if(lottos[i]==0)
        		zero++;
        	 else{
        		for(int j=0;j<win_nums.length;j++){
        			if(lottos[i]==win_nums[j])
        				win++;
        		}
        	}
        }
        
        if(win<2){
        	answer[1] = 6;
        	if(zero+win<2){
        		answer[0] = 6;
        	} else {
        		answer[0] = 6-zero==0? 1:6-zero;
        	}
        } else {
        	answer[1] = 7-win;
        	answer[0] = 7-(win+zero);
        }
        	
        
        return answer;
    }
}