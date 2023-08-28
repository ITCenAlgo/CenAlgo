while (n := int(input())) != 0:
    word = [input() for _ in range(n)]
    print(sorted(word, key=lambda x: x.lower())[0])
