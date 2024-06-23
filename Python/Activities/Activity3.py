#Provide players names in output
player1= input("Player 1's name: ")
player2= input("Player 2's name: ")

#Provide players answers in output
player1_answer= input(player1+" what do you choose from rock, paper or scissors?: ").lower()
player2_answer= input(player1+" what do you choose from rock, paper or scissors?: ").lower()

#Execute logic to see who wins
if player1_answer==player2_answer:
   print("It's a tie")
elif player1_answer=="rock":
   if player2_answer=="scissors":
      print("rock wins")
   else:
      print("paper wins")
elif player1_answer=="scissors":
   if player2_answer=="paper":
      print("Scissors win")
   else:
      print("rock wins")
elif player1_answer=="paper":
   if player2_answer=="rock":
      print("paper wins")
   else:
      print("scissors win")
else:
   print("Invalid input. player not entered rock,paper or scissors. try again")