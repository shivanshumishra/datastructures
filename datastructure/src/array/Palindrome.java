package array;

public class Palindrome {
	public static void main(String args[]) {
		Palindrome obj = new Palindrome();
		System.out.println(obj.solve("madam"));
		System.out.println(obj.solve("Hello"));
	
	}
	
	public boolean solve(String s) {
		int forward = 0;
		int backward = s.length() - 1;
		while(forward < backward) {
			if(s.charAt(forward)!=s.charAt(backward))
				return false;
			
			forward++;
			backward--;
		}
		return true;
	}
}
