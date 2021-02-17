package Encapsulation;

public class Student {
//    private String name;
//    public String getName(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//}

    protected int studentID;
    protected String name;
    protected String collegeName;
    protected String address;

    protected Student(int studentID, String name, String collegeName, String address) {
        this.studentID = studentID;
        this.name = name;
        this.collegeName = collegeName;
        this.address = address;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}



