package pl.ablech.nauka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.ablech.nauka.entities.Collage;
import pl.ablech.nauka.entities.Student;
import pl.ablech.nauka.utils.HibernateUtils;

/**
 * Created by Arek on 07.12.2016.
 */
public class TestOneToMany {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Homer");
        student.setSurname("Simpson");
        student.setDeansGroup("AI1001");

        Student student1 = new Student();
        student1.setName("Rasputin");
        student1.setSurname("Vladimirovich");
        student1.setDeansGroup("RU123");


        Collage collageCaliforania  = new Collage();
        collageCaliforania.setName("South California University");



        student.setCollage(collageCaliforania);
        student1.setCollage(collageCaliforania);
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(collageCaliforania);
        session.save(student);
        session.save(student1);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
