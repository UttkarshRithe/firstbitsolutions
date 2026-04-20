#include<stdio.h>
typedef struct Product
{
    int id;
    char name[20];
    int quantity;
    int price;
}Product;
void setdata(Product*);
void getdata(Product*);
int main()
{
    Product s1;
    setdata(&s1);
    printf("\n");
    getdata(&s1);
     
}
void setdata(Product* std)
{
    printf("Enter id: ");
    scanf("%d",&std->id);
    printf("Enter name: ");
    scanf("%s",std->name);
    printf("Enter quantity:");
    scanf("%d",&std->quantity);
    printf("Enter price:");
    scanf("%d",&std->price);
}
void getdata(Product* std)
{
    printf("id : %d\n",std->id);
    printf("Name : %s\n",std->name);
    printf("Quantity: %d\n",std->quantity);
	printf("Price: %d",std->price);
}


