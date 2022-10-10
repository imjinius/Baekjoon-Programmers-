class Solution {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int yWidth = yellow + 2;
		int needs = 0;

		if ((yWidth * 2) + 2 > brown) {
			for (int i = 2; needs != brown || answer[0] < answer[1]; i++) {
				if (yellow % i == 0) {
					needs = ((yellow / i) + (i + 2)) * 2;
					answer[0] = i + 2;
					answer[1] = (yellow / i) + 2;
				}
			}

		} else {
			answer[0] = yWidth;
			answer[1] = 3;
		}

		return answer;
	}
}