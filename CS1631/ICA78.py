'''
movies = ["The Holy Grail", "The Life of Brian", "The Meaning of Life"]

year = 1975
movies2 = []

for each_movie in movies:
    movies2.append(each_movie)
    movies2.append(year)
    year = year + 4
'''


'''
movies = ["The Holy Grail", 1975 , "The Life of Brian", 1979, "The Meaning of Life", 1983]

def movie_lister(libst):
    for i in libst:
        print(i)
'''

libst = ["spam", "Spam", "SPAM"]

def wicked_replace_function(input):
    for target in libst:
        if target == input:
            libst[libst.index(target)] = "eggs"
