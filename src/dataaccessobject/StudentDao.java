package dataaccessobject;

import java.util.List;

/**
 * Created by khiem on 9/14/16.
 */
public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
