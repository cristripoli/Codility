package codility.time_complexity.perm_missing_elem;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public int solution(int[] A) {
		
		if(A == null) {
			return 1;
		}
		Set<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toSet());
		
		int biggerElement = A.length + 1;
		
		for(int i = 1 ; i <= biggerElement ; i++) {
			if(list.add(i)) {
				return i;
			}
		}
		
		return 0;
	}
	
	public int solution1(int[] A) {
		
		if(A == null) {
			return 1;
		}
		
		int biggerElement = A.length + 1;
		
		List<Integer> list = Arrays.stream(A)
			      .boxed()
			      .collect(Collectors.toList());
		
		
		for(int i = 1 ; i <= biggerElement ; i++) {
			if(!list.contains(i)) {
				return i;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[] { 5, 3, 1, 2 }));
		System.out.println(s.solution(new int[] { 2, 1 }));
		System.out.println(s.solution(new int[] { 1 }));
		System.out.println(s.solution(new int[] { 2 }));
		System.out.println(s.solution(new int[] { 10, 8, 1, 2, 3, 5, 9, 4, 6  }));
	}
}
