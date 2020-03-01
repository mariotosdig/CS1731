# Project: RPS in py
# Author: Andrew MacKenzie
# Version: 1.0.0

#imports would go here

outcomes = [["It's a draw!", "Player 2 Wins!", "Player 1 wins!"], ["Player 1 Wins!", "It's a draw!", "Player 2 Wins!"], ["Player 2 wins!", "Player 1 wins!", "It's a draw!"]]

print("Welcome to a simple rock paper scissors program!")
print("I don't think I need to explain the rules.")

#player 1 makes a choice
player_one_choice = 0
while player_one_choice == 0:
    player_one_choice = input("Player 1, choose between rock, paper, and scissors. [Enter R, P, or S]: ").lower()
    if player_one_choice not in ['r', 'p', 's']:
        print("That's not a valid choice!")
        player_one_choice = 0

print("Player 1's input has been accepted.")

#player 2 makes a choice
player_two_choice = 0
while player_two_choice == 0:
    player_two_choice = input("Player 2, choose between rock, paper, and scissors. [Enter R, P, or S]: ").lower()
    if player_two_choice not in ['r', 'p', 's']:
        print("That's not a valid choice")
        player_two_choice = 0

print("Player 2's input has been accepted.")

input("Press enter to see who wins.")
player_one_choice = "rps".find(player_one_choice)
player_two_choice = "rps".find(player_two_choice)
print(outcomes[player_one_choice][player_two_choice])
