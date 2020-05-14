package codility.cesar.task1;

public class Solution {
	
	public String solution(String S) {
		

		StringBuilder alphaSmallestString = new StringBuilder(S);
		alphaSmallestString = alphaSmallestString.deleteCharAt(0);
		 
		 for(int i=1; i < S.length() ; i++){
			 
			 StringBuilder currentSmallestString = new StringBuilder(S);
			 currentSmallestString = currentSmallestString.deleteCharAt(i);
			 
			 if(!currentSmallestString.equals(alphaSmallestString) && 
				 currentSmallestString.toString().compareTo(alphaSmallestString.toString()) < 0) {
				 alphaSmallestString = currentSmallestString;
			 }
	     }
		
		System.out.println(alphaSmallestString);
		return alphaSmallestString.toString();
		 
		 
	 }
	 
	 public static void main(String[] args) {
		Solution s = new Solution();
		s.solution("acb");
		s.solution("hot");
		s.solution("codility");
		s.solution("aaaa");
	 }


}
