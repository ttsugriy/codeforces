expr = input()
counts = [0] * 4
for val in (1, 2, 3):
    counts[val] = expr.count(str(val))
print("+".join("+".join([str(val)] * cnt) for val, cnt in enumerate(counts) if cnt > 0))
