#pythagorean triple
a=int(input("enter first number:"))
b=int(input("enter second number:"))
c=int(input("enter third number"))
if (a*a==b*b+c*c) or (b*b==a*a+c*c) or (c*c==a*a+b*b):
    print("1")
else:
    print("0")

