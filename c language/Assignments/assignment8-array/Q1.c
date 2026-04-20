//find maximum and minimum from array
#include<stdio.h>
int main()
{
    int run[] ={29,14,109,103,69};
     int max = run[0];
     int min = run[0];
    for (int i = 1; i < 5; i++)
    {
       if(run[i]>max)
       {
         max=run[i];
       }
    }
    printf("Max from array is: %d",max);
    printf("\n");
    for (int j = 1; j < 5; j++)
    {
      if (run[j]<min)
      {
        min = run[j];
      }
    }
    printf("Min from array is: %d",min);
}