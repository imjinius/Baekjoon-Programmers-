import java.util.*;

public class Solution {
    public static List<Integer> solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int start = arr[0];
        list.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
        	if(start != arr[i]){
        		list.add(arr[i]);
        		start = arr[i];
        	}
        }

        return list;
    
    }
}