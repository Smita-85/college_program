...
#GRADE IN PYTHON
sub1 = int(input("enter first subject mark:"))
sub2 = int(input("enter second subject mark:"))
sub3 = int(input("enter third subject mark:"))
average = sub1 + sub2 + sub3 / 3
if average > 90:
    print("GRADE-A")
elif average > 80 and average < 90:
    print("GRADE-B")
elif average > 70 and average < 80:
    print("GRADE-C")
elif average > 60 and average < 70:
    print("GRADE-D")
elif average < 60:
    print("GRADE-F")
else:
    print("FAIL")

