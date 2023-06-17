package StudentDomen;

import java.util.Iterator;
import java.util.List;

//  Имплементирую интерфейс сортировки в класс
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private int numberGroup;

    public StudentGroup(List<Student> students, int numberGroup) {
        this.students = students;
        this.numberGroup = numberGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    // Переопределим метот вывода на консоль
    @Override
    public String toString() {
        StringBuilder strBid = new StringBuilder();
        strBid.append(String.format("numberGroup=%s\n", numberGroup));
        for (Student stud : students) {
            strBid.append(stud.toString());
            strBid.append("\n");
        }
        return strBid.toString();
    }

    /**
     * @return
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }

                return students.get(index++);
            }
        };

    }

    // Переопределение метода сортировки
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getNumberGroup() == o.getNumberGroup()) {
            return 0;
        }
        if (this.getNumberGroup() < o.getNumberGroup()) {
            return -1;
        }
        return 1;
    }

}
