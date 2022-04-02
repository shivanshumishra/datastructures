package array;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		String s1 = "restful";
		String s2 = "fluster";
		
		Anagrams obj = new Anagrams();
		boolean result = obj.solve(s1.toCharArray(), s2.toCharArray());
		System.out.print(result);
		
	}
	
	public boolean solve(char[] a, char[] b) {
		if(a.length != b.length) {
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0 ; i<a.length;i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
}
