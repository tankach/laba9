package sumdu.edu.ua.webstudent.DAO;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sumdu.edu.ua.webstudent.res.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{
    Student addStudent(Student student);

    // Отримати всіх студентів
    List<Student> getAllStudents();

    // Отримати студента за ідентифікатором
    Student getStudentById(Integer studentId);

    // Оновити інформацію про студента
    Student updateStudent(Student student);

    // Видалити студента за ідентифікатором
    void deleteStudent(Integer studentId);

    public Student getOne(int parseInt);

    public void save(Student student);

    public List<Student> findAll();

    public Object findById(Long StudentId);

    public void deleteById(Long StudentId);
}