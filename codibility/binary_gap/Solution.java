package codibility.binary_gap;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
	
	public int solution(int N) {
		
		int longestBinaryGapSize = 0;
		
		String binary = Integer.toBinaryString(N);
		List<String> gaps = Arrays.asList(binary.split("(?=1)"));
		
		for (Iterator<String> it = gaps.iterator(); it.hasNext(); ) {
			
			String gap = it.next();
			
			if(gap.contains("0") && 
			   it.hasNext() && 
			   longestBinaryGapSize < gap.length() - 1)
				
					longestBinaryGapSize = gap.length() - 1;
			
			}
		
		return longestBinaryGapSize;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
		System.out.println(s.solution(529));
		System.out.println(s.solution(22));
		System.out.println(s.solution(32));
		System.out.println(s.solution(15));
		System.out.println(s.solution(1041));
	}

}
