package codility.time_complexity.tape_equilibrium;

public class Solution {
	
	public int solution(int[] A) {
		
		int minResult = Integer.MAX_VALUE;
		int fisrtTapeSum = 0;
		int secondTape = 0;
		int total = 0;
		
		if (A.length == 2){ return Math.abs(A[1]-A[0]); }
		 
		for(int i = 0; i < A.length; i++) {
			total += A[i];
		}
		
		for(int i = 0; i < A.length; i++) {
			fisrtTapeSum += A[i];
			secondTape = total - fisrtTapeSum;
			int result = Math.abs(fisrtTapeSum - secondTape);
			if(minResult > result)
				minResult = result;
		}
		
		System.out.println(minResult);
		return minResult;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(new int[] { 3, 1, 2, 4, 3});
		s.solution(new int[] { 3, 1});
		s.solution(new int[] { -3, -1, -2, -4, -3});
		s.solution(new int[] { -3, -1, -2, 4, 3});
		
	}

}
