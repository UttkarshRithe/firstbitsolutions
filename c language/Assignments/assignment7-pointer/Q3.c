#include<stdio.h>
float caltemp(float*);
int main()
{
    float celsius=32;
    float res = caltemp(&celsius);
    printf("result:%lf",res);
}
float caltemp(float* cel)
{
    float faren = ((*cel)*9/5)+32;
    return faren;
}