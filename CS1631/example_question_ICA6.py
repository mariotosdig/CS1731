#
#
#

def do_twice (f, x):
    f(x)
    f(x)

def print_twice(x):
    print(x)
    print(x)

def do_four(f, x):
    do_twice(f, x)
    do_twice(f, x)

do_twice(print_twice, 'spam')
print('something else')
do_four(print_twice, 'spam')
