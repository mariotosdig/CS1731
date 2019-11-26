#Katherine Campbell and Andrew Mackenzie
#CS1631 Assignment 3

import time

inventory = ["apple"]
cash_money = 0
gameover = False

def input_request(options, prompt, inventory):
    x = None

    while x not in options:
        x = input(prompt)

        if x == "i":
            print("=============================================")
            print("Your inventory contains the following items: ")
            for i in inventory:
                print(i)
            print("")
            print("=============================================")
            x = None

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

x = None
while x != "y" and x != "n":
    x = input("Would you like to pick it up? [y/n] ").lower()
    x = request(x, inventory)

if x == "y":
    print("You pick up the jackhammer. ")
    inventory.append("jackhammer")
    time.sleep(1)
elif x == "n":
    print("You leave the jackhammer on the ground. ")
    time.sleep(1)

print("Would you like to go to the bank or the railroad? [b/r]")

x = None
while x != "b" and x != "r":
    x = input("Enter 'b' for bank or 'r' for railroad. ").lower()
    x = request(x, inventory)

while gameover == False:
    if x == "r":
        print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
        print("You have arrived at the railroad")
        time.sleep(1)
        print("You see a crowbar on the ground.")

        x = None
        while x != "y" and x != "n":
            x = input("Would you like to pick it up? [y/n] ").lower()
            x = request(x, inventory)

        if x == "y":
            print("You pick up the crowbar. ")
            inventory.append("crowbar")
            time.sleep(1)
        elif x == "n":
            print("You leave the crowbar on the ground. ")
            time.sleep(1)

        print("It seems there is nothing else here for you.")
        x = None
        while x != "b":
            x = input("Enter 'b' to go to the bank. ").lower()
            x = request(x, inventory)


    if x == "b":
        print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
        print("You have arrived at the front of your local bank.")
        time.sleep(1)
        x = None
        while x != "y" and x != "n":
            x = input("Would you like to break into the bank? [y/n]").lower()
            request(x, inventory)

        if x == "y":
            x = None
            while x != "v" and x != "h" and x != "w":
                print("How would you like to enter?")
                time.sleep(1)
                x = input("Enter 'v' to go through the vents or 'h' to hack in or 'w' to walk through the front door.").lower()
                request(x, inventory)

            if x == "v":
                print('\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n')
                print("You have made it into the safe.")
                time.sleep(2)
                print("Which of the following items would you like to use?")
                time.sleep(1)
                print("A jackhammer, crowbar or an apple.")
                x = None
                while x != "jackhammer" and x != "crowbar" and x != "apple":
                    x = input("Enter the item you would like to use: ")
                    request(x, inventory)

                if x == "jackhammer":
                    if "jackhammer" in inventory:
                        cash_money = 1000
                        print("You have obtained {}$ from the bank.".format(cash_money))
                        gameover = True
                        print("GAME OVER")
                    else:
                        print("You dont have a jackhammer!")
                        gameover = True
                        print("GAME OVER")

                elif x == "crowbar":
                    if "crowbar" in inventory:
                        cash_money = 1000
                        print("You have obtained {}$ from the bank.".format(cash_money))
                        gameover = True
                        print("GAME OVER")
                    else:
                        print('You do not have a jackhammer.')
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
                    x = None
                    while x != "jackhammer" and x != "crowbar" and x != "apple":
                        x = input("Enter the item you would like to use: ")
                        request(x, inventory)

                    if x == "jackhammer":
                        if "jackhammer" in inventory:
                            cash_money = 1000
                            print("You have obtained {}$ from the bank.".format(cash_money))
                            gameover = True
                            print("GAME OVER")
                        else:
                            print("You dont have a jackhammer!")
                            gameover = True
                            print("GAME OVER")

                    elif x == "crowbar":
                        if "crowbar" in inventory:
                            cash_money = 1000
                            print("You have obtained {}$ from the bank.".format(cash_money))
                            gameover = True
                        else:
                            print('you dont have a jackhammer')
                            gameover = True
                            print("GAME OVER")
                    elif x == "apple":
                        print('well at least you got a healthy snack?')
                        gameover = True
                        print("GAME OVER")





        elif x == "n":
            print("Then let's go to the railroad. ")
            time.sleep(2)
            x = None
            while x != "r":
                x = input("Enter 'r' to go to the railroad. ").lower()
                request(x, inventory)

###########
input("Press enter to end the script. ")
