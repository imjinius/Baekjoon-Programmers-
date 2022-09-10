class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String word:str){
        	answer += flag ? word.toUpperCase():word;
        	flag = word.equals(" ")? true:false;
        }
        	
        
        return answer;
    }
}