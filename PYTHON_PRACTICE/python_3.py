#calculator  in python
operator=(input("enter operator"))
num1=int(input("enter first number"))
num2=int(input("enter second number"))
if operator=='+':
     add=int(num1+num2)
     print("sum of two numbers:",add)
elif operator=='-':
     diff=int(num1-num2)
     print("differnce between two numbers:",diff)
elif operator=='*':
     prod=int(num1*num2)
     print("product of two numbers:",prod)
elif operator=='/':
    rem=int(num1/num2)
    print("quotient of two numbers:",rem)
elif operator=='^':
    pow=int(num1^num2)
    print("power of two numbers:",pow)
elif operator=='%':
    mod=int(num1%num2)
    print("reminder of two numbers:",mod)
else:
    print("not a operator")

