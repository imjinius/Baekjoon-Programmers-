import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a=0;a<commands.length;a++){
        	
        	int[] cutArr = Arrays.copyOfRange(array, commands[a][0]-1, commands[a][1]);
        	Arrays.sort(cutArr);
        	
        	answer[a] = cutArr[commands[a][2]-1];
        }
        
        return answer;
    }
}