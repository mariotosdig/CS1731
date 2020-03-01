
scrabble_letters = [' ','A','B','C','D','E','F','G','H','I','J','K','L','M',
                    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z']


letter_scores = [0, 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3,
                 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10]

def scrabble_score(list_of_words):
    scrabble_scorez = []
    for word in list_of_words:
        word = word.upper()
        score = 0
        for letter in word:
            score += letter_scores[scrabble_letters.index(letter)]
        scrabble_scorez.append(score)
    return scrabble_scorez


def scrabble_score2(list_of_words):
    scrabble_scorez = []
    for word in list_of_words:
        word = word.upper()
        score = 0
        for letter in word:
            counter = 0
            for i in scrabble_letters:
                if i == letter:
                    x = counter
                counter += 1
            score += letter_scores[x]
        scrabble_scorez.append(score)
    return scrabble_scorez
