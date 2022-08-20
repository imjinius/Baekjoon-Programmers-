import java.util.TreeSet;

class Solution {
    public static TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> ts = new TreeSet<>();
        int num = 0;
        
        for(int i=0;i<numbers.length-1;i++){
        	num++;
        	for(int j=num;j<numbers.length;j++){
        		ts.add(numbers[i]+numbers[j]);
        	}
        }
        
        return ts;
    }
}