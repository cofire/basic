#include "stdio.h"
#include "string.h"

main(void){
	char arr[10]="hello";
	printf("%d\n", strlen(arr));
	printf("%d\n", sizeof(arr));

	char* parr=new char[10];
	printf("%d\n", strlen(parr));
	printf("%d\n", sizeof(parr));
	printf("%d\n", sizeof(*parr));
}
