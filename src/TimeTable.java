public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9 ;  // 9 hours per day

    private ClassDetails[][] grid;

    public TimeTable(){
        grid = new ClassDetails[DAYS][HOURS];
        // the grid will have null values
    }

    public void set(int day, int hour, ClassDetails details) {
        // store details at the specified position in the grid
        grid[day][hour] = details;
    }

    public void display() {
        // display the grid
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                System.out.printf("%-40s",grid[i][j]+" ");
            }
            System.out.println("\n");
        }
    }

    public ClassDetails get(int day, int hour) {
        // returns the object at the specified position in the grid
        return grid[day][hour];
    }

    public int getNumberOfClassesFor(String name){ //e.g. get number of Algorithms classes
        int count = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] != null)
                {
                    if(grid[i][j].getName().equals(name))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public int getNumberOfFreeSlots(){
        int count = 0;

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == null)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

