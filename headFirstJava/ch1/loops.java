public class loops {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Before the loop");
		while(x < 4) {
			System.out.println("Within the loop");
			System.out.println("x = " + x);
			x = x+1;
		}
		System.out.println("After the loop");
	}
}
