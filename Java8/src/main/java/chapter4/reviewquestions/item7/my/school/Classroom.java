package chapter4.reviewquestions.item7.my.school;

public class Classroom {

    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321; // package private field
    public int floor = 3;

    public Classroom(int r, String t) {
        roomNumber = r;
        teacherName = t;
    }
}
