#include <stdio.h>
int main() { int num,s,j;
            scanf("%d",&num);
            while(num>=100)
            {
            s=num/10;
            num=s;
            }
            num=num%10;
            printf("%d",num);
	
	return 0;
}