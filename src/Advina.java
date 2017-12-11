import java.util.Scanner;

public class Advina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int usuario;
		do {
			usuario = sc.nextInt();
			if (usuario > x) {
				System.out.println("MENOR");
			}
			if (usuario < x) {
				System.out.println("MAYOR");
			}
		} while (usuario != x);
		System.out.println("ACERTASTE");

	}
}
