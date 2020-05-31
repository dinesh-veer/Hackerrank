import java.util.HashSet;
import java.util.Set;

public class SubstringContainingVowels {

	public static void main(String[] args) {
		 String str = "aeoibsddaaeiouudb"; 
	        findSubstring(str); 
	}

	private static void findSubstring(String str) {

		Set<Character> set=new HashSet<>();
		int start=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				set.add(str.charAt(i));
				if(set.size()==5) {
					System.out.println(str.substring(start,i+1) + " ,");
				}
			}else {
				set.clear();
				start=i+1;
			}
		}
		
	}

	private static boolean isVowel(char charAt) {

		
		return ((charAt=='a')||(charAt=='e')||(charAt=='i')||(charAt=='o')||(charAt=='u') );
	}
}
