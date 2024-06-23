fruits={
    "apple": 10,
    "orange": 30,
    "banana": 25,
    "Pineapple": 42
}

requiredFruit= input("Enter any fruit name from the available fruits: ").lower()
if(requiredFruit in fruits):
    print("Yes, it's available")
else:
    print("No, it's not available")