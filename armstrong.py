n=int(input("enter your number : "))

sum=0

order= len(str(n))

arm = n

while(n>0):
    digit = n%10
    sum = sum+digit**order
    n=n//10
    
if(sum==arm):
    print(" This is armstrong number")
else:
    print("This is not armstrong number ")
    
