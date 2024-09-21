import java.util.Iterator;
import java.util.List;

public class StudentGroupInerator implements Iterator<Student> {

    private List<Student> studentsGroup;

    private int index;

    public StudentGroupInerator() {
        this.studentsGroup = studentsGroup();
        this.index = -1;
    }

    private List<Student> studentsGroup() {
        return List.of();
    }

    @Override
    public boolean hasNext() {
        return index < studentsGroup.size()-1 ;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentsGroup.get(++index);
    }

    @Override
    public void remove() {
        if (index >= 0 && index < studentsGroup.size()) {
            studentsGroup.remove(index);
        }
    }

}