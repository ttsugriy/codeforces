loc = (-1, -1)
for row_idx in range(5):
    if (found := input().find("1")) != -1:
        loc = (row_idx, found // 2)
print(abs(2 - loc[0]) + abs(2 - loc[1]))
