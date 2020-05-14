package codility.cesar.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution3 {
	
	public int solution(int[] A) {
		Set<Integer> list = Arrays.stream(A)
							.boxed()
							.filter(x -> x > -10 && x < 10)
							.collect(Collectors.toSet());
		
		int max = Collections.max(list);
		System.out.println(max);
		return max;
		 
		 
	 }
	 
	 public static void main(String[] args) {
		Solution3 s = new Solution3();
		s.solution(new int [] { -6, -91, 1011, -100, 84, -22, 0, 1, 473 });
		s.solution(new int [] { -6, -91, -1011, -100, 84, 9, 0, 1, 4703 });
		s.solution(new int [] { -9, -91, -1011, -100, 84, 90, 10, 11, 4703 });
		s.solution(new int [] { -9, -91, -1011, -100, 84, 90, 9, 11, 4703 });
		s.solution(new int [] { -9, -91, 0, -100, 84, 90, 99, 11, 4703 });
		
		
	 }


}
