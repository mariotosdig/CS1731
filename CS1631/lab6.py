# Andrew MacKenzie & Yuansu Fei

def has_23(x):
    if 2 in x or 3 in x:
        return True
    else:
        return False

def reverse_three(x):
    y = []
    y.append(x[2])
    y.append(x[1])
    y.append(x[0])
    return y

def has_22(libst):
    iterator = 0
    for i in libst:
        if i == 2 and libst[iterator-1] == 2 and iterator != 0:
            return True
        iterator += 1
    return False

def count_22s(libst):
    iterator = 0
    count = 0
    for i in libst:
        if i == 2 and libst[iterator-1] == 2 and iterator != 0:
            count += 1
        iterator += 1
    return count
