#include "stdio.h"

typedef struct
{
	int a:2;//a二进制两位
	int b:2;//b二进制两位
	int c:1;//c二进制1位
}test;

main(){
	test t;
	t.a=1;//二进制01
	t.b=3;//二进制11
	t.c=1;//二进制1
	printf("%d %d %d\n", t.a,t.b,t.c);
}
