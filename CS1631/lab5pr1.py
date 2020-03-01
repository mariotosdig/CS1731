# COMP 1631 Lab 5
# Filename: lab5pr1.py
# Names: Andrew MacKenzie & Yuansu Fei

# Problem desc: finding the max of three numbers

# The my_max function takes three numbers as input -- either ints or floats
# and returns the largest of the three values

def my_max(value_1, value_2, value_3):
    if (value_1 > value_2) and (value_1 > value_3):
        return value_1
    elif (value_2 > value_1) and (value_2 > value_3):
        return value_2
    else:
        return value_3

# The absolute function takes an integer as an inout
# and returns a positive integer

def absolute(value):
    if value < 0:
        value = value * -1
        return value
    else:
        return value

# The areTriangular function takes 3 integers
# and tests whether or not the given numbers could be useed to make a triangle

def areTriangular(value1, value2, value3):
    if value1 >= value2 + value3 or value2 >= value1 + value3 or value3 >= value2 + value1:
        return False
    else:
        return True

# The mystery_counter function takes an integer
# and returns a mystery value after a number of loop iterations equal to the integer provided

def mystery_counter(x):
    if x >=1:
        mystery = x
        while not x == 1:
            mystery = mystery + x**2
            x = x - 1
        return mystery
    else:
        print("Error. x < 1")
