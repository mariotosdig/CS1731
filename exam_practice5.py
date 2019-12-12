from random import randint

number = randint(1,100)
correct = False

okBoomer = input('u wanna guess ur number in binary for some reason? ').lower()
if okBoomer in ['y', 'yes']:
    pass
elif okBoomer in ['n', 'no']:
    pass
else:
    print('defaulting to integers cuz i dont have time for ur shit. ')

for i in range(3):
    if correct == False:
        user_input = int(input("bro what the number be lmao. "))
        if number == user_input:
            print('ye')
            correct = True
        elif user_input > number:
            print('ur too high lmao like weed get it.')
        elif user_input < number:
            print('u low like a ho bro. ')

if correct == False:
    print("you complete dumbass. you couldn't even guess a simple little number? you're a fucking failure. you should drop out of university. i bet your sorry ass is failing everything. you're a disgrace to the entire world. you absolute fucking idiot.")
