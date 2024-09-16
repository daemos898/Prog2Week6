public class StudentInfo {
    int rollno; //Create variable Int for roll number
    String name; //Create variable string for name
    String address; //Create variable string for address

    public StudentInfo(int rollno, String name, String address) { //Creates student info in which information will be stored
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() { //Creates order and format in which information will be printed
        return "Roll Number: " + rollno + " |  Name: " + name + " |  Address: " + address;
    }
}