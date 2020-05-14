package codility.array.odd_occurrences_in_array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {


	public int solution(int[] A) {
		
		Set<Integer> oddOcurrences = new HashSet<>();
		
		if(A == null || A.length == 0) {
			return 0;
		}
		
		for(int i : A) {
			if(!oddOcurrences.contains(i)) {
				oddOcurrences.add(i);
			} else {
				oddOcurrences.remove(Integer.valueOf(i));
			}
		}
		printArray(oddOcurrences);		
		
		Iterator<Integer> itr = oddOcurrences.iterator();  
        return itr.next();  
	}
	
	
	public void printArray(Set<Integer> A) {
		for(int a : A) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Solution s =new Solution();
		s.solution(new int [] { 9, 3, 9, 3, 9, 7, 9 });
		s.solution(new int [] { 1, 2, 1, 3, 5, 2, 3 });
		s.solution(new int [] { 1, 2, 1, 3, 5, 2, 3, 1, 1, 2, 2 });
		s.solution(new int [] { 1000000, 2000000, 1000000, 30000000, 5000000, 2000000, 30000000 });
		s.solution(new int [] { 9, 7, 9, 3, 9, 3, 9 });

	}
}
