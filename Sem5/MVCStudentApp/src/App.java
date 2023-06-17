import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Model.Model;
import Model.Student;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Сергей", "Иванов", 21, 101);
       Student s2 = new Student("Андрей", "Сидоров", 22, 111);
       Student s3 = new Student("Иван", "Петров", 22, 121);
       Student s4 = new Student("Игорь", "Иванов", 23, 301);
       Student s5 = new Student("Даша", "Цветкова", 25, 171);
       Student s6 = new Student("Лена", "Незабудкина", 23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

       Model model = new Model(students);
       View view = new View(); 
        
       Controller controller = new Controller(view, model);
       controller.update();
    }
}