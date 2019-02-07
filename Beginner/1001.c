#include <stdio.h>

int main(){
	
	int first_number, second_number, sum; // declaring every variable we need
	
	scanf("%i", &first_number); // capturing the first number of the sum
	scanf("%i", &second_number); // capturing the second number of the sum

	sum = first_number + second_number; // setting sum variable to first number + second number
		
	printf("X = %i\n", sum); //printing the resultant value

	return 0;
}