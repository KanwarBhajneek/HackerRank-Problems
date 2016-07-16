//Save the Prisoner !
import java.util.*;

public class SaveThePrisoner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int S = sc.nextInt();
			System.out.println((S + M - 1) % N == 0 ? N : (S + M - 1) % N);
		}

	}
}
