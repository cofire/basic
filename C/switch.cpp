#include "stdio.h"

main(void)
{
	int i;
	for(i=0;i<3;i++){
		//i的值不可是float
		switch(i)
		{
			case(0):printf("%d\n", i);
			case(2):printf("%d\n", i);
			default:printf("%d\n", i);
		}
	}
}
