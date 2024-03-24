#PIZZA ORDER PROGRAM
user_choice=input("enter the size of pizza that u want:")
bill=0
if user_choice=='S' or user_choice=='s':
    bill+=100
    print("for small size pizza cost is 100 rupees")
elif user_choice=='M' or user_choice=='m':
    bill+=200
    print("for medium size pizza cost is 200 rupees")
else:
    bill+=300
    print("for large size pizza cost is 300")

pepronii=input("whether you want to add pepronii or not(Y/N):")
if pepronii=='y' or pepronii== 'y':
    if user_choice=='S' or user_choice=='s':
        bill+=30
    else:
        bill+=50

cheese=input("whether you want extra cheese or not(Y/N):")
if cheese=='Y' or cheese=='y':
    bill+=20

print("total cost is:",bill)
