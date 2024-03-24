#number checking in python
num1=int(input("enter first number"))
num2=int(input("enter second number"))
num3=int(input("enter third number"))
if num1!=num2 and num1!=num3 and num2!=num3:
    print("1")
elif num1==num2 or num1==num3 or num2==num3:
    print("0")
else:
    print("false")