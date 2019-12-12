from random import randint

number = randint(1,100)

while gameover == False:
    user_input = input("bro what the number be lmao. ")
    if number == user_input:
        print('ye')
        gameover = True
