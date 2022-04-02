package array;

public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger obj = new ReverseInteger();
		obj.solve(1002);
	}
	
	public void solve(int num) {
		while(num>0) {
			System.out.print(num%10);
			num = num/10;
		}
	}
}
