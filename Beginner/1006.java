import java.util.Scanner;
import java.util.Locale;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		Locale.setDefault(Locale.US);

		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		scan.close();

		double average = ((a * 2) + (b * 3) + (c * 5)) / 10.0;

		System.out.printf("MEDIA = %.1f\n", average);
	}
}
