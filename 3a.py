s = input()
t = input()

col, row = map(ord, s)
t_col, t_row = map(ord, t)

moves = max(abs(col - t_col), abs(row - t_row))
print(moves)
while col != t_col or row != t_row:
  row_mov, col_mov = '', ''
  if col < t_col:
    col += 1
    col_mov = 'R'
  elif col > t_col:
    col -= 1
    col_mov = 'L'
  if row < t_row:
    row += 1
    row_mov = 'U'
  elif row > t_row:
    row -= 1
    row_mov = 'D'
  print(f"{col_mov}{row_mov}")
