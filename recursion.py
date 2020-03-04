def while_loop(condition, increment, i):
    condition = i < 5
    if not condition:
        return

    print("Hello world!")
    i += increment

    while_loop(True, 1, i)


print("program start")
while_loop(True, 1, i=0)
print("program end")
