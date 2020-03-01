#
# I better get 100% or higher
#

def lone_sum(a,b,c):
    if a == b and a == c:
        return 0
    if a == b:
        a = 0
        b = 0
    if b == c:
        a = 0
        b = 0
    if a == c:
        a = 0
        c = 0
    return a + b + c

def cat_dog(str):
    cats = x.count('cat')
    dogs = x.count('dog')
    if cats == dogs:
        return True
    else:
        return False

def has_22(libst):
    count = 0
    for i in range(len(libst) - 1):
        if libst[i] == 2 and libst[i+1] == 2:
            count += 1
    return count

for i in range(0,5):
    print('i = ', i)

'apple'[3:]


'''
abC + -(AC + C + B)

000 1
100 1
110 0
111 0
010 0
001 1
011 0

abc + Abc + abC
b(ac + Ac + aC)
b(c + aC)
'''



'''

 01001010 = 74
-00101001 = 41
==========
 00100001 = 33 / 33

 00011010 = 26
*00001100 = 12
==========
  = 312






'''
