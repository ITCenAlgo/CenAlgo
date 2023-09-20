N = int(input())
card, i = list(range(1, N + 1)), -1
while (i := i + 2) < len(card):
    card.append(card[i])
print(card[-1])
