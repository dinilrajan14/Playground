#include<stdio.h>
int main()
{ int n,z,y;
 scanf("%d",&n);
 z=n%10;
 y=n/100;
printf("%d",z+y);
  return 0;
}