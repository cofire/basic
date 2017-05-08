#include "stdio.h"

main(void){
	int a,b,c,d;
	a=10;
	b=a++;
	c=++a;
	d=10*a++;
	printf("%d %d %d %d\n", a,b,c,d);

	int i=4;
	i+=i++;printf("%d\n", i);
	i=4;
	i+=++i;printf("%d\n", i);
	i=4;
	++i+=i;printf("%d\n", i);
	i=4;
	++i+=i++;printf("%d\n", i);
	i=4;
	++i+=++i;printf("%d\n", i);
}
