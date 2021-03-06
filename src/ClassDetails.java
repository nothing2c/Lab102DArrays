public class ClassDetails {
    private String name;  //e.g. Algorithms
    private String roomNumber;   //e.g. R201

    public ClassDetails(String name, String roomNumber)
    {
        this.name=name;
        this.roomNumber = roomNumber;
    }

    public String toString()
    {
        return "Name: " + name + ", Room No: " + roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

