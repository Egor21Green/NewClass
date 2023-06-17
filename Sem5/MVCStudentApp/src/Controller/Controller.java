package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    public void getAllStudents() {
        students = model.getAllStudents();

    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;

        } else {
            return false;
        }
    }

    public void update() {
        // MVP
        getAllStudents();
        if (testData()) {
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пуст");
        }

        //MVC
        // view.printAllStudents(model.getAllStudents());
    }
}
