
gender= input("enter gender:M/F:")
age = int(input("Enter age:"))
if(gender == 'F'):
    if(age>=18):
        print("Eligible for marrige")
    else:
        print("Not eligible for marriage")    
else:
    if(age>=21):
        print("Eligible for marrige")
    else:
        print("Not eligible for marriage")

