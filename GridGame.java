public class GridGame
{
    public static final int OUT = -1;
    public static final int LOST = -2;
    int rows;
    int columns;
    char [][] gameboard;

    public GridGame( int row, int col, char[][] board)
    {
        rows = row;
        columns = col;
        gameboard = board;
    }

    public int playGame()
    {
        Boolean [][] visited = new Boolean[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                visited[i][j] = false;
        }
        int current_row = 0;
        int current_col = 0;
        int turn_count = 0;

        while(true)
        {
            visited[current_row][current_col] = true;
            if (gameboard[current_row][current_col] == 'T')
                return turn_count;
            else if (gameboard[current_row][current_col] == 'E')
            {
                current_col++;
            }
            else if (gameboard[current_row][current_col] == 'W')
            {
                current_col--;
            }
            else if (gameboard[current_row][current_col] == 'N')
            {
                current_row--;
            }
            else if (gameboard[current_row][current_col] == 'S')
            {
                current_row++;
            }
            turn_count++;

            if (((current_col >= columns)||(current_row >= rows))||((current_col < 0)||(current_row < 0)))
                return OUT;

            if (visited[current_row][current_col])
                return LOST;
        }
    }
}
