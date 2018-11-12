package chapter4.reviewquestions.item7.my.city;

import chapter4.reviewquestions.item7.my.school.Classroom;

public class School {

    public static void main(String[]args) {
        // Generate an error because is not public
        //System.out.println(Classroom.globalKey);

        Classroom classroom = new Classroom(101, "hola");
    }
}
