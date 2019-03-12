import java.sql.Time;

public class TimeTableMain {
    public static void main(String[] args) {

        TimeTable table = new TimeTable();

        table.set(0,0,new ClassDetails("LAN", "T107"));
        table.set(0,1,new ClassDetails("Testing", "T118"));
        table.set(0,3,new ClassDetails("Algorithms", "T116"));
        table.set(1,0,new ClassDetails("Algorithms", "T302"));
        table.set(1,3,new ClassDetails("Testing", "T300"));
        table.set(1,4,new ClassDetails("Software", "R302"));
        table.set(2,1,new ClassDetails("Games", "R300"));
        table.set(2,3,new ClassDetails("Software", "S114"));
        table.set(3,0,new ClassDetails("LAN", "R200"));
        table.set(3,1,new ClassDetails("Animation", "R204"));
        table.set(3,3,new ClassDetails("LAN", "T106"));
        table.set(4,0,new ClassDetails("Games", "R300"));
        table.set(4,1,new ClassDetails("Animation", "R204"));

        table.display();

        System.out.println(table.get(0,0));

        System.out.println(table.getNumberOfClassesFor("Games"));

        System.out.println(table.getNumberOfClassesFor("kosdjif"));

        System.out.println(table.getNumberOfFreeSlots());
    }
}
