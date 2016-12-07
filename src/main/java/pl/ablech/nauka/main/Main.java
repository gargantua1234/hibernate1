package pl.ablech.nauka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.ablech.nauka.entities.Student;
import pl.ablech.nauka.utils.HibernateUtils;

/**
 * Created by Arek on 07.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Homer");
        student.setSurname("Simpson");
        student.setDeansGroup("AI1001");

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
