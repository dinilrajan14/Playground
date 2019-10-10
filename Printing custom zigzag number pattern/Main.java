#include <stdio.h>
int main() {   int i, j, N;
    scanf("%d", &N);
    for(i=1; i<=N; i++)
    {
        for(j=1; j<=N; j++)
        {
            if(i%2==1)
            {
              if(j==N)
              {
            
                printf("%d",i+1);
               }
               else
               {
                printf("%d",i);
               }
            }
          else
          {
              if(j==1)
                printf("%d",i+1);
              else
                printf("%d",i);
          }
        }
        printf("\n");
    }
	return 0;
}