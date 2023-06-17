package StudentDomen;

import java.util.Iterator;
import java.util.List;

//  Создадим класс поток студентов с полем номер потока, содержащий в себе список учебных групп(StudentGroup)
public class StudentSteam implements Iterable<StudentGroup> {
    private int streamNumber;
    private List<StudentGroup> studentGroup;

    public StudentSteam(int streamNumber, List<StudentGroup> studentGroup) {
        this.streamNumber = streamNumber;
        this.studentGroup = studentGroup;
    }

    public int getStreamNumber() {
        return streamNumber;
    }

    public void setStreamNumber(int streamNumber) {
        this.streamNumber = streamNumber;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    // Переопределим метод вывода в консоль
    @Override
    public String toString() {
        return "StudentSteam{" +
                "numberSteam='" + streamNumber + '\'' +
                ", groups=" + studentGroup +
                '}';
    }

    // Переопределение итератора
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studentGroup.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }

                return studentGroup.get(index++);
            }
        };

    }

}
