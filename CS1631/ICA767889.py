# an inventory, which is initially empty
inventory = []

# a dictionary linking a room to other rooms
rooms = {

            'Hall' : {
                  'south':'Kitchen',
                  'east':'Bedroom',
                  'item':'cat'
                },

            'Bedroom' : {
                  'west':'Hall',
                  'item':'pillow'
                },

            'Bathroom' : {
                  'east':'Kitchen',
                  'item':'plunger'
                },

            'Kitchen' : {
                  'north':'Hall',
                  'west':'Bathroom',
                  'item':'knife'
                }

         }

def showInstructions():
  #print a main menu and the commands
  print('''
Adventure Game
========
Commands:
  go [direction]
  get [item]
  exit
''')

def showStatus():
  #print the player's current status
  print('---------------------------')
  print('You are in the ' + currentRoom)
  #print the current inventory
  print('Inventory : ' + str(inventory))
  #print an item if there is one
  if 'item' in rooms[currentRoom]:
    print('You see a ' + rooms[currentRoom]['item'])
  print("---------------------------")


# start the player in the Hall
currentRoom = 'Hall'
playing = True

showInstructions()

# loop until player says exit
while playing:

  showStatus()

  # get the player's next 'move'
  # .split() breaks it up into a list
  # e.g., typing 'go east' would give the list:
  # ['go','east']

  move = ''
  while move == '':
    move = input('>')

  move = move.lower().split()

  # if they type 'go' first
  if move[0] == 'go':
    # check that they are allowed wherever they want to go
    if move[1] in rooms[currentRoom]:
      # set the current room to the new room
      currentRoom = rooms[currentRoom][move[1]]
    # there is no door (link) to the new room
    else:
        print('You can\'t go that way!')

  # if they type 'get' first
  if move[0] == 'get' :

    if len(move) == 3:
        move[1] = "{} {}".format(move[1],move[2])
        move.pop(2)

    #if the room contains an item, and the item is the one they want to get
    if 'item' in rooms[currentRoom] and move[1] in rooms[currentRoom]['item']:
      #add the item to their inventory
      inventory += [move[1]]
      # display a helpful message
      print(move[1] + ' got!')
      # delete the item from the room
      del rooms[currentRoom]['item']
    # otherwise, if the item isn't there to get
    else:
      # tell them they can't get it
      print('Can\'t get ' + move[1] + '!')

  if move[0] == 'drop':
     #if you have said item
     if move[1] in inventory:
       inventory.remove(move[1])
       # display a helpful message
       print(move[1] + ' dropped!')
       # delete the item from the room
       rooms[currentRoom]['item'] = move[1]
     else:
         print("you literally don't even have a {}.".format(move[1]))

  if move[0] == 'exit' :
        print('You\'ve chosen to quit the game.')
        playing = False
