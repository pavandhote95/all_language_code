print("This program for you are elible or not for vote ")

age = int(input("enter your age  : "))

if age < 18:
    print("you are not eligible ")
elif age > 100:
    print("invailed age ")

elif age > 18:
    print("congratulation you can vote ")

else:
    print("invalid input ")
