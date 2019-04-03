import java.util.Scanner;
import java.util.Locale;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		scan.close();

		double average = ((a * 3.5) + (b * 7.5)) / 11.0;

		System.out.printf("MEDIA = %.5f\n", average);
	}
}
