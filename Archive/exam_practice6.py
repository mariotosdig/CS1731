words = input("enter a sentence bro: ").split()
count = 0
for word in words:
    if word[0] in ['a','e','i','o','u']: word += 'way'
    else:
        word = word[1:] + word[0].lower() + 'ay'
        if word[0] == word[0].upper(): word = word.capitalize()
    words[count] = word
    count += 1
print(" ".join(words))
