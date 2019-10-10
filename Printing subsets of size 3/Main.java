#include<stdio.h>
int main()
{
       int size;
       scanf("%d",&size);
       int arr[10];
       for(int i = 0; i <= size ; i++)
       {
   scanf("%d",&arr[i]) ;
       }
  for(int i1=0;i1<=size-2;i1++)
  {
    for(int i2=i1+1;i2<=size-1;i2++)
    {
    for(int i3=i2+1;i3<=size-1;i3++)
    {
      printf("(%d, %d, %d) " , arr[i1],arr[i2],arr[i3]);
    }
    }
    printf("\n");
  }

  return 0;
}