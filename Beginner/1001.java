import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a + b;

		scan.close();

		System.out.println("X = " + sum);
	}
}
