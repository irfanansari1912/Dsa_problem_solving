package Lec22;

public class Fact_tail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n, 1));

	}

	public static int fact(int n, int ans) {
		if (n == 0) {
			
		}

		return fact(n - 1, ans * n);// sp

	}

}
