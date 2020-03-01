import random

scrabble_letters = [' ','A','B','C','D','E','F','G','H','I','J','K','L','M',
                    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z']


letter_scores = [0, 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3,
                 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]

def make_dictionary(keys, values):
    dict = {}
    for index in range(len(keys)):
        dict[keys[index]] = values[index]
    return dict

def scrabble_score(list_of_words):
    scrabble_scorez = []
    for word in list_of_words:
        word = word.upper()
        score = 0
        for letter in word:
                score += scrabble_dictionary[letter]
        scrabble_scorez.append(score)
    return scrabble_scorez

count = 0
for i in letter_scores:
    letter_scores[count] = random.randint(1,100)
    count += 1

scrabble_dictionary = make_dictionary(scrabble_letters, letter_scores)
