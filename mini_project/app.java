package mini_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService service = context.getBean(StudentService.class);

        Course course = new Course();
        course.setCourseName("Spring and Hibernate");
        course.setDuration(6);

        Student student = new Student();
        student.setName("Sujit Kumar");
        student.setBalance(10000);
        student.setCourse(course);

        service.addStudent(student);

        System.out.println("🎉 Record inserted successfully!");
    }
}
