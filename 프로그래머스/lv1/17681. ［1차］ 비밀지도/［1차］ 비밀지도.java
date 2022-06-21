class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        answer = new String[n];
		
		for(int i=0;i<n;i++){
			String[] map1 = String.format("%0"+n+"d",
                        Long.parseLong(Integer.toBinaryString(arr1[i]))).split("");
			String[] map2 = String.format("%0"+n+"d",
                        Long.parseLong(Integer.toBinaryString(arr2[i]))).split("");
			String result = "";
			
			for(int j=0;j<n;j++){
				if(map1[j].equals("1") || map2[j].equals("1")){
					result = result+"#";
				}
				else if(map1[j].equals("0") && map2[j].equals("0")){
					result = result+" ";
				}
			}
			answer[i] = result;
		}
        return answer;
    }
}