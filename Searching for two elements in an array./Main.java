#include<stdio.h>
int main()
{
       
        int arr_size;
        scanf("%d",&arr_size);
        int arr[10];
        
        for(int i= 0; i <= arr_size - 1; i++)
        {
            scanf("%d",&arr[i]);
        }
        
        int search_1;
        scanf("%d",&search_1);
        int search_2;
        scanf("%d",&search_2);
        
        int elem_1_i = -1;
        int elem_2_i = -1;
       
        for(int i = 0; i<= arr_size - 1; i++)
        {
            if(search_1 == arr[i])
            {
                elem_1_i = i;
            }
            if(search_2 == arr[i])
            {
                elem_2_i = i;
            }
        }
        printf("%d\n",elem_1_i);
        printf("%d\n",elem_2_i);
    return 0;
}