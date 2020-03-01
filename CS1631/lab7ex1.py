regina = ["stop","trying","to","make","fetch","happen"]

count = 0
for x in range(len(regina)):
    print("counting appearances in",regina[x])
    for y in range(len(regina[x])):
        if regina[x][y] == 't':
            count += 1

print("There is/are {} of the letter t in the list".format(count))
