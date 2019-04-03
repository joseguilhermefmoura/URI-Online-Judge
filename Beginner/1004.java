import java.util.Scanner;
import java.util.Locale;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
		Locale.setDefault(Locale.US);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int prod = a * b;

		scan.close();

		System.out.println("PROD = " + prod);
	}
}
