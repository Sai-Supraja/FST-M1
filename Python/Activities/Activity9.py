firstList= [1, 4, 5, 8, 7]
secondList= [12, 15, 21, 30, 47]
print("First list: ", firstList)
print("Second list: ", secondList)
thirdList= []

for num in firstList:
    if(num%2!=0):
        thirdList.append(num)
for num in secondList:
    if(num%2==0):
        thirdList.append(num)

print("Result list: ")
print(thirdList)