package codility.array.cyclic_rotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	 
	public int[] solution(int[] A, int K) {
		
		if(A == null || A.length == 0) {
			return A;
		}
		
		List<Integer> list = Arrays.stream(A)
			      .boxed()
			      .collect(Collectors.toList());
		
		
		for(int i = 0 ; i < K; i ++){
			int last = list.remove(list.size() -1);
			list.add(0, last);
		}
		
		return list.stream().mapToInt(i->i).toArray();
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		s.printArray(s.solution(new int[] { 3, 8, 9, 7, 6 }, 3));
		s.printArray(s.solution(new int[] { 0, 0, 0 }, 1));
		s.printArray(s.solution(new int[] {1, 2, 3, 4 }, 4));
		s.printArray(s.solution(new int[] {1, 2, 3, 4 }, 3));
	}
	
	public void printArray(int[] A) {
		for(int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
}