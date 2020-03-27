import csv

with open("econ_scores.txt") as file:
    libst = []
    reader = csv.reader(file, delimiter='\n')
    for x in reader:
        i = []
        i = x[0].split("          ")
        libst.append(i)
        print i
    floaty = 0.0
    for count in range(len(libst)):
        floaty += float(libst[count][1])
    print(floaty/101)
