#include "stdio.h"

main(void){
	enum{a,b=3,c,d=5,e};//第一个变量默认为0；后面的默认是前一个加1；
	printf("%d %d %d %d %d\n", a,b,c,d,e);
}