
#include<stdio.h>
int increasing_sub_array(int arr_size, int arr[], int sum_arr[]);
int main()
{
    int arr_size;
	scanf("%d",&arr_size);
    int arr[arr_size];
    for(int i = 0;i< arr_size; i++)
    {
        scanf("%d", &arr[i]);   
    }
    int sum_arr[3 * arr_size];
    increasing_sub_array(arr_size, arr, sum_arr);
    return 0;
}    
int increasing_sub_array(int arr_size, int arr[], int sum_arr[])
{
	for(int i1 = 0; i1 <= arr_size - 1; i1++)
    {
        int key =  arr[i1];
        int flag = 1;
        for(int i2 = i1+1; i2<=arr_size-1;i2++)
        {
            if(arr[i2]>key)
            {
                for(int i3 = i1; i3 <= i2; i3++)
                {
                    if(arr[i3]>arr[i2])
                    flag = 0;
                }
                if(flag == 1)
                printf("%d,%d\n", key, arr[i2]);
            }
            flag = 1;
        }
    }
    return 0;
}