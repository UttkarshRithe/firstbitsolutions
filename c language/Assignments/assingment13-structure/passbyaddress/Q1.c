#include<stdio.h>
typedef struct Student
{
    int id;
    char name[20];
    int marks;
}Student;
void setdata(Student*);
void getdata(Student*);

int main()
{
    Student s1;
    setdata(&s1);
    printf("\n");
    getdata(&s1);
}
void setdata(Student* s)
{
    printf("Enter id of student: ");
    scanf("%d",&s->id);
    printf("Enter name of student: ");
    scanf("%s",s->name);
    printf("Enter marks of student: ");
    scanf("%d",&s->marks);
}
void getdata(Student* s)
{
    printf("\t----info of student----\n");
    printf("id:%d name:%s marks:%d",s->id,s->name,s->marks);
}