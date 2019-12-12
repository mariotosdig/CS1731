words = input("enter a sentence bro: ")
words = words.split()

count = 0
for word in words:
    letter = word[0]
    if letter in ['a','e','i','o','u']:
        word += 'way'
    else:
        letterx = letter.lower()
        word = word[1:] + letterx + 'ay'
        if letter == letter.upper():
            word = word.capitalize()
    words[count] = word
    count += 1

words = " ".join(words)
print(words)
