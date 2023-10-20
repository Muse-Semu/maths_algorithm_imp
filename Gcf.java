package maths;

public class Gcf {

	public static int gcf(int a, int b) {
		int gcf = 1;
		if (a == b) {
			gcf = a;
		} else {
			if (a > b) {
				if (a % b == 0) {
					gcf = b;
				} else {
					for (int i = 2; i < b; i++) {
						if (a % i == 0 && b % i == 0) {
							gcf = i;
						}
					}
				}
			} else {
				if (b % a == 0) {
					gcf = a;
				}

				else {
					for (int i = 2; i < a; i++) {
						if (a % i == 0 && b % i == 0) {
							gcf = i;
						}
					}
				}
			}
		}
		return gcf;

	}

	public static void main(String[] args) {
		System.out.println(gcf(1800, 756));

	}
}
