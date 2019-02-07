#include <stdio.h>

int main(){

	double pi = 3.14159, area, radius; // It's needed to use double data type because there is much numbers after the dot

	scanf("%lf", &radius); // We scan double data type using "l" in front of the type letter "f" which corresponds to "long float"

	area = (radius * radius) * pi; // We set the area using the mathematical formula [A = R² * pi]

	printf("A=%.4lf\n", area); // We set the printf to print 4 numbers after the dot (ex: 3.3333) using the ".4" in front of "lf".

	return 0;
}
