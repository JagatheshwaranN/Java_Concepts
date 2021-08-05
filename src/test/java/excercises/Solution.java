package excercises;

public class Solution {
	int solution(int[] A) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 4 == 0)
				ans =  A[i];
		}
		return ans;
	}

	public static void main(String ar[]) {
		int[] a = { 0, -100, 84,-34, 35 };
		Solution s = new Solution();
		System.out.println(s.solution(a));
	}
}
