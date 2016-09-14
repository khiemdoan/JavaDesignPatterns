package dataaccessobject;

/**
 * Created by khiem on 9/14/16.
 */
public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        // print all students
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
        }

        // update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michae1");
        studentDao.updateStudent(student);

        // get the student
        student = studentDao.getStudent(0);
        System.out.println("Student: [RollNo: " + student.getRollNo() + ", Name: " + student.getName() + "]");
    }
}
