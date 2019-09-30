#include <stdio.h>

int main (){
	
	int numero, horas;
	float salario, salariofinal;
	
	scanf("%i", &numero);
	scanf("%i", &horas);
	scanf("%f", &salario);
	
	salariofinal = horas * salario;
	
	printf("NUMBER = %i\n", numero);
	printf("SALARY = U$ %.2f\n", salariofinal);
	
	return 0; 
}
