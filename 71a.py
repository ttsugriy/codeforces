for _ in range(int(input())):
    word = input()
    print(word[0] + str(len(word) - 2) + word[-1] if len(word) > 10 else word)
