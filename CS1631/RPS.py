import random

#### List balues for outcomes ####
def value(RPS):
  if RPS in ('rock', 'r'):
    return 0
  elif RPS in ('paper', 'p'):
    return 1
  elif RPS in ('scissors', 's'):
    return 2

while True:
#### User's choice ###############
  while True:
    human_choice = input('rock, paper, or scissors: ').lower()
    if human_choice in ('rock', 'paper', 'scissors', 'r', 'p', 's'):
      break

#### Computer's Choice ###########
  computer_choice = random.choice(('rock', 'paper', 'scissors'))

#### End #########################
  print("Computer picked " + computer_choice + ".")
  outcomes = [['Draw!', 'You lose!', 'You win!'], ['You win!', 'Draw!', 'You lose!'], ['You lose!', 'You win!', 'Draw!']]
  print(outcomes[value(human_choice)][value(computer_choice)])
