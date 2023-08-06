print("This program for user input number prime or not ")
n = int(input("enter your number : "))
i=1;
temp=0

while(i<=n):
      if(n%i==0):
          temp=temp+1
      i=i+1
if(temp==2):
    print("prime")
else:
    print("not prime")