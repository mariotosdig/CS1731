#Katherine Campbell and Andrew Mackenzie
#CS1631 Assignment 4

import time

inventory = ["apple"]
cash_money = 0
gameover = False

def input_request(options, prompt, inventory):
    x = None

    dictionary_of_things_in_room={"entrance": None, "street": "jackhammer", "outside bank": None, "vents": "coin", "matrix": None, "bank lobby":None, "railroad":"crowbar" }

    while x not in options:
        x = input(prompt).lower()

        if x == "i":
            print("=============================================")
            print("Your inventory contains the following items: ")
            for i in inventory:
                print(i)
            print("")
            print("=============================================")
            x = None

        elif x == "r":


        elif x == "d":
            x = input("Which item would you like to drop? ").lower()
            if x in inventory:
                inventory.remove(x)
                print("'{}' has been removed from your inventory.".format(x))
            else:
                print("Your inventory does not contain a(n) '{}'.".format(x))
            x = None
    return x

print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
print("Welcome to [game title goes here]. ")
print("Choose from the options given in each prompt to forward the story. ")
print("During any prompt you can use the input 'i' to see your inventory. ")
print("You can also chose to drop one of your items with an input of 'd'.")

input("Press the Enter key to start. ")
print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')

print("You appear from the abyss. ")
time.sleep(1)
print("A magical wizard appears in front of you. ")
time.sleep(2)
print("Wizard: yo bro it's adventurning time!!!!! ")
time.sleep(2)
print("Wizard: choose your path wisely young one as it will determine your fate. ")
time.sleep(2)

x = input_request(["w"], "Enter 'w' to walk forward.", inventory)

print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
print ("You appear to be in a metropoliton city.")
time.sleep(2)
print("You see a jackhammer in front of you. ")
time.sleep(1)

x = input_request(["y","n"], "Would you like to pick it up? [y/n] ", inventory)

if x == "y":
    print("You pick up the jackhammer. ")
    inventory.append("jackhammer")
    time.sleep(1)
elif x == "n":
    print("You leave the jackhammer on the ground. ")
    time.sleep(1)

print("Would you like to go to the bank or the railroad? [b/r]")

x = input_request(["b","r"], "Enter 'b' for bank or 'r' for railroad. ", inventory)

while gameover == False:
    if x == "r":
        print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
        print("You have arrived at the railroad")
        time.sleep(1)
        print("You see a crowbar on the ground.")

        x = input_request(["y","n"], "Would you like to pick it up? [y/n] ", inventory)

        if x == "y":
            print("You pick up the crowbar. ")
            inventory.append("crowbar")
            time.sleep(1)
        elif x == "n":
            print("You leave the crowbar on the ground. ")
            time.sleep(1)

        print("It seems there is nothing else here for you.")
        x = input_request(["b"], "Enter 'b' to go to the bank. ", inventory)

    if x == "b":
        print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
        print("You have arrived at the front of your local bank.")
        time.sleep(1)
        x = input_request(["y","n"], "Would you like to break into the bank? [y/n] ", inventory)

        if x == "y":
            print("How would you like to enter?")
            time.sleep(1)
            x = input_request(["v", "h", "w"], "Enter 'v' to go through the vents or 'h' to hack in or 'w' to walk through the front door. ", inventory)

            if x == "v":
                print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
                print("You have made it into the safe.")
                time.sleep(2)
                print("Which of the following items would you like to use?")
                time.sleep(1)
                print("A jackhammer, crowbar or an apple.")
                x = input_request(["jackhammer", "crowbar", "apple"], "Enter the item you would like to use: ", inventory)

                if x.lower() in ["crowbar", "jackhammer"]:
                    if x in inventory:
                        cash_money = 1000
                        print("You have obtained {}$ from the bank.".format(cash_money))
                        gameover = True
                        print("GAME OVER")
                    else:
                        print('You do not have a {}.'.format(x))
                        gameover = True
                        print("GAME OVER")
                elif x == "apple":
                    print('well at least you got a healthy snack? ')
                    gameover = True
                    print("GAME OVER")

            elif x == 'h':
                x = input('do you know what you are doing? ')
                y = input('is your laptop on? ')
                w = input('do you own the bank? ')
                z = input('are you god? ')
                if x == "yes" and y == "yes":
                    cash_money = 1000
                    print("You have obtained {}$ from the bank.".format(cash_money))
                    gameover = True
                    print("GAME OVER")
                elif w == 'yes' or z == 'yes':
                    cash_money = 1000
                    print("You have obtained {}$ from the bank.".format(cash_money))
                    gameover = True
                    print("GAME OVER")
                else:
                    print("You have been caught!")
                    cash_money = -172.50
                    print("You have obtained {}$ from the bank.".format(cash_money))
                    gameover = True
                    print("GAME OVER")

            elif x == 'w':
                x = input('do you bank here? ')
                y = input('are you wearing a mask? ')
                if x == "yes" and y == "no":
                    print("you've been caught!")
                    cash_money = -172.50
                    print("You have obtained {}$ from the bank.".format(cash_money))
                    gameover = True
                    print("GAME OVER")
                else:
                    print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
                    print("you have made it into the safe.")
                    time.sleep(2)
                    print("Which of the following items would you like to use?")
                    time.sleep(1)
                    print("A jackhammer, crowbar or an apple.")
                    x = input_request(["jackhammer", "crowbar", "apple"], "Enter the item you would like to use: ", inventory)

                    if x.lower() in ["crowbar", "jackhammer"]:
                        if x in inventory:
                            cash_money = 1000
                            print("You have obtained {}$ from the bank.".format(cash_money))
                            gameover = True
                            print("GAME OVER")
                        else:
                            print('You do not have a {}.'.format(x))
                            gameover = True
                            print("GAME OVER")
                    elif x == "apple":
                        print('well at least you got a healthy snack?')
                        gameover = True
                        print("GAME OVER")

        elif x == "n":
            print("Then let's go to the railroad. ")
            time.sleep(2)
            x = input_request(["r"], "Enter 'r' to go to the railroad. ", inventory)

###########
input("Press enter to end the script. ")
