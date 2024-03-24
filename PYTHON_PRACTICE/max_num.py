numbers=input("enter numbers with space:")
num_list=numbers.split()
count=0
max=0
for i in num_list:
    count=count+1
print(count)
for i in range(count):
    num_list[i]=int(num_list[i])
print(num_list)
for i in num_list:
    if i > max:
        max=i
print(f"The maximum number is: {max}")









