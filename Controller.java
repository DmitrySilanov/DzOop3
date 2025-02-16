import java.util.List;

public class Controller {

    private StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService;


    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public boolean delStudent(String f, String i, String o) {
        return studentGroupService.removeStudent(f, i, o);
    }

    public void sortByStudentIdOfStudentGroup(){
        studentGroupService.sortStudentsById();
    }

    public void sortByNameOfStudentGroup(){
        studentGroupService.sortStudentsByName();
    }

    public void sortBySizeListStream(){
        streamService.sortStudentsStreamBySize();
    }
}
