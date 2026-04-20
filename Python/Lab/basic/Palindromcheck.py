num=int(input("Enter Number: "))
temp = num

reverse=0
remainder = num%10
num = num//10
reverse = reverse*10+remainder
remainder = num%10
num=num//10
reverse = reverse = reverse*10+remainder
remainder = num%10
num = num//10
reverse = reverse = reverse*10+remainder
if(temp == reverse):
    print(f'Given Number {temp} is palindrom')

