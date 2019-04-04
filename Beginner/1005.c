#include <stdio.h>

int main (){
	double number1, number2, average; 
	scanf("%lf", &number1);
	scanf("%lf", &number2);
	average = ((number1 * 3.5) + (number2 * 7.5)) / 11;
	printf("MEDIA = %.5f\n", average);
	return 0; 
}
