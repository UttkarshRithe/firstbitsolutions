#include<stdio.h>
#include<string.h>
typedef struct student
{
    int rollno;
    char name[20];
    int marks;
}student;
student setdata(student);
void getdata(student);
int main()
{
    student s1;
    s1=setdata(s1);
    printf("\n");
    getdata(s1);
     
}
student setdata(student std)
{
    printf("Enter rollno: ");
    scanf("%d",&std.rollno);
    printf("Enter name: ");
    scanf("%s",std.name);
    printf("Enter marks:");
    scanf("%d",&std.marks);
    return std;
}
void getdata(student std)
{
    printf("Roll no : %d\n",std.rollno);
     printf("Name od std: %s\n",std.name);
     printf("Marks of std: %d",std.marks);
}
