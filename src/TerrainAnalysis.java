public class TerrainAnalysis {

    int[][] grid;
    int rows;
    int columns;

    public TerrainAnalysis(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;

        grid = new int[rows][columns];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                grid[i][j] = (int)(Math.random() * 20);
            }
        }
    }

    public String display()
    {
        String display = "";

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                display += String.format("%-2d",grid[i][j]) +" ";
            }

            display += "\n";
        }

        return display;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getNumberOfPeaks()
    {
        int count = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                if(this.isPeak(i,j))
                {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPeak(int row, int column)
    {
        int number = grid[row][column];

        if(isLeftLower(row, column) && isUpperLower(row, column) && isRightLower(row, column) && isBottomLower(row, column))
            return true;
        else
            return false;
    }

    private boolean isBorder(int row, int column)
    {
        if(row == 0 || row == rows-1 || column == 0 || column == columns - 1)
            return true;
        else
            return false;
    }

    private boolean isLeftLower(int row, int column)
    {
        if(!isBorder(row, column))
        {
            if(grid[row][column-1] < grid[row][column])
                return true;
            else
                return false;
        }
        else
            return false;
    }

    private boolean isUpperLower(int row, int column)
    {
        if(!isBorder(row, column))
        {
            if(grid[row-1][column] < grid[row][column])
                return true;
            else
                return false;
        }
        else
            return false;
    }

    private boolean isRightLower(int row, int column)
    {
        if(!isBorder(row, column))
        {
            if(grid[row][column+1] < grid[row][column])
                return true;
            else
                return false;
        }
        else
            return false;
    }

    private boolean isBottomLower(int row, int column)
    {
        if(!isBorder(row, column))
        {
            if(grid[row+1][column] < grid[row][column])
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
