public class MagicSquare {

    public static void main(String[] args) {
        int[][] grid = new int[4][4];

        grid[0][0] = 16;
        grid[0][1] = 3;
        grid[0][2] = 2;
        grid[0][3] = 13;
        grid[1][0] = 5;
        grid[1][1] = 10;
        grid[1][2] = 11;
        grid[1][3] = 8;
        grid[2][0] = 9;
        grid[2][1] = 6;
        grid[2][2] = 7;
        grid[2][3] = 12;
        grid[3][0] = 4;
        grid[3][1] = 15;
        grid[3][2] = 14;
        grid[3][3] = 1;

        int[][] grid2 = new int[2][3];

        grid2[0][0] = 4;
        grid2[0][1] = 2;
        grid2[0][2] = 1;
        grid2[1][0] = 3;
        grid2[1][1] = 5;
        grid2[1][1] = 6;

        int[][] grid3 = new int[3][3];

        grid3[0][0] = 3;
        grid3[0][1] = 0;
        grid3[0][2] = 8;
        grid3[1][0] = 3;
        grid3[1][1] = 3;
        grid3[1][2] = 2;
        grid3[2][0] = 3;
        grid3[2][1] = 87;
        grid3[2][2] = 3;


        if(isMagicSquare(grid))
        {
            System.out.println("This is a magic square");
        }
        else
            System.out.println("This is not a magic square");

        if(isMagicSquare(grid2))
        {
            System.out.println("This is a magic square");
        }
        else
            System.out.println("This is not a magic square");

        if(isMagicSquare(grid3))
        {
            System.out.println("This is a magic square");
        }
        else
            System.out.println("This is not a magic square");
    }

    public static boolean isMagicSquare(int[][] grid)
    {
        boolean isMagic;
        int magicNumber = grid[0].length * grid.length;

        if(isSquare(grid) && containsAllNumbers(grid))
        {
            for(int i = 0; i < grid[0].length; i++)
            {
                if(calculateRowTotal(grid, i) != magicNumber)
                    return false;
                else
                    return true;
            }
        }
        else
            return false;
    }

    public static boolean isSquare(int[][] grid)
    {
        if(grid.length == grid[0].length)
            return true;
        else
            return false;
    }

    public static boolean containsAllNumbers(int[][] grid)
    {
        int maxNumber = grid.length * grid[0].length;
        int[] allNumbers = new int[maxNumber];

        for(int i = 0; i < allNumbers.length; i++)
        {
            allNumbers[i] = i+1;
        }

        for(int i = 0; i < grid[0].length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                if(grid[i][j] >= 1 && grid[i][j] <= maxNumber)
                    allNumbers[grid[i][j]-1] = 0;
            }
        }

        for(int i : allNumbers)
        {
            if(i != 0)
                return false;
        }

        return true;
    }

    public static int calculateRowTotal(int[][] grid, int row)
    {
        int total = 0;
        for(int i = 0; i < grid.length; i++)
        {
            total += grid[row][i];
        }

        return total;
    }
}
