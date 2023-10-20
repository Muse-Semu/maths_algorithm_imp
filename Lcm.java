package maths;

public class Lcm {
	public static int lcm(int a, int b) {
		int m = a;
		int n = b;
		while (m != n) {
			if (m > n) {
				n += b;
			} else {
				m += a;
			}
		}
		return n;

	}

	public static void main(String[] args) {
		System.out.println(lcm(123, 63));
	}
}
