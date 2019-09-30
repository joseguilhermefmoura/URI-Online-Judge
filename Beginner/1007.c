#include <stdio.h>

int main(){
	int a, b, c, d, diferenca;
	scanf("%i", &a);
	scanf("%i", &b);
	scanf("%i", &c);
	scanf("%i", &d);
	
	diferenca = (a * b) - (c * d);
	
	printf("DIFERENCA = %i\n", diferenca);
	
	return 0;
}
