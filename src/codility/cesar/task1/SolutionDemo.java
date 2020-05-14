package codility.cesar.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionDemo {
	
	 public int solution(int[] A) {
		 
		 List<Integer> list = Arrays.stream(A)
			      .boxed()
			      .collect(Collectors.toList());
		 int maxValue = Collections.max(list);
		 
		 if(maxValue < 0)
			 return 1;
		 
		 for(int i = 1 ; i <= maxValue + 1; i ++) {
			 if(!list.contains(i)) {
				 System.out.println(i);
				 return i;
			 }
		 }
		 
		 return 0;
	 }
	 
	 public static void main(String[] args) {
		SolutionDemo s = new SolutionDemo();
		s.solution(new int[] { 1, 3, 6, 4, 1, 2});
		s.solution(new int[] { 1, 2, 3});
		s.solution(new int[] { -1, -3});
	}

}
