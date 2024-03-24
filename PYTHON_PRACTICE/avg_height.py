height=(input("enter the heights with space:"))
height_list=height.split()
count=0
sum=0
for i in height_list:
    count=count+1
print(count)
for i in range(count):
    height_list[i]=int(height_list[i])
print(height_list)
for i in height_list:
    sum=sum+i
print(sum)
average=sum/count
print(round(average))


