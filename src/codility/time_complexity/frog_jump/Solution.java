package codility.time_complexity.frog_jump;

public class Solution {
	
	public int solution(int X, int Y, int D) {
		
		int distanceToJump = Y - X;
		int jump = distanceToJump / D;
		
		if(distanceToJump % D > 0)
			jump++;
		
		System.out.println(jump);
		return jump;
	}
	
	public int solution1(int X, int Y, int D) {
		int jumpQtty = 0;
		
		while(X < Y) {
			X += D;
			jumpQtty ++;
		}
		System.out.println(jumpQtty);
		return jumpQtty;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.solution(10, 85, 30);
		s.solution(1, 14, 3);
		s.solution(10, 1001, 100);
		s.solution(150000,  999999,  10000);
		s.solution(150000, 1000000,  10000);
	}
}
