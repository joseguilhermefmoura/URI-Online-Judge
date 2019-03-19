import java.util.Scanner;
import java.util.Locale;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
		Locale.setDefault(Locale.US);

		// area = pi * r^2
		double r = scan.nextDouble();
		double pi = 3.14159;
		double area = pi * (r * r);

		scan.close();

		System.out.printf("A=%.4f\n", area);
	}
}
