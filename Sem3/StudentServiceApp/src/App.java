import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
// import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        // User u1 = new User("Sergey", "Ivanov", 25);
        Student s1 = new Student("Ivan", "Ivanov", 18, 101);
        Student s2 = new Student("Andrey", "Petrov", 19, 102);
        Student s3 = new Student("Kolya", "Sidorov", 20, 103);
        Student s4 = new Student("Dasha", "Collesn", 21, 104);
        Student s5 = new Student("Lena", "Hot", 18, 105);
        Student s6 = new Student("Vanya", "Derzkya", 18, 106);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group1 = new StudentGroup(listStud, 1);
        StudentGroup group2 = new StudentGroup(listStud2, 2);

        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(group1);
        studentGroups.add(group2);
        StudentSteam steamGroup = new StudentSteam(1, studentGroups);
        System.out.println(steamGroup);

        for (StudentGroup stud : steamGroup) {
            System.out.println(group1);
            System.out.println(group2);
            System.out.println(stud);

        }
        Collections.sort(listStud);
        Collections.sort(listStud);
       
        
    }
}