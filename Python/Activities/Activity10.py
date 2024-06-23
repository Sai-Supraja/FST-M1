numbers= list(input("List of numbers: ").split(", "))
numTuple= tuple(numbers)
print(numTuple)
print("Elements that are divisible by 5:")
for num in numTuple:
    if (int(num) % 5 == 0):
        print(num)