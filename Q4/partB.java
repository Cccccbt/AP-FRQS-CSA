public boolean clearPair(int row, int col)
    {
        for (int r = row; r < puzzle.length; r++)
        {
            for (int c = 0; c < puzzle[0].length; c++)
            {
                if ((r != row || c != col) && (puzzle[r][c] == puzzle[row][col] || puzzle[r][c] + puzzle[row][col] == 10))
                {
                    puzzle[r][c] = 0;
                    puzzle[row][col] = 0;
                    return true;
                }
            }
        }

        return false;
    }
