public class TerrainAnalysis {

    int[][] grid;
    int rows;
    int columns;

    public TerrainAnalysis(int rows, int columns)
    {
        this.rows = rows;
        this.columns = columns;

        grid = new int[rows][columns];
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

    public int numberOfPeaks()
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
        //if(grid[row][column])

        return true;
    }
}
