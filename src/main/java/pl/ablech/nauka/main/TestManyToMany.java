package pl.ablech.nauka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.ablech.nauka.entities.Author;
import pl.ablech.nauka.entities.Book;
import pl.ablech.nauka.utils.HibernateUtils;

import java.util.ArrayList;

/**
 * Created by Arek on 16.12.2016.
 */
public class TestManyToMany {
    public static void main(String[] args) {

        Author am = new Author();
        am.setName("Adam");
        am.setSurname("Mickiewicz");

        Author bp = new Author();
        bp.setName("Boleslaw");
        bp.setSurname("Prus");

        Author rf = new Author();
        rf.setSurname("Fridrich");
        rf.setName("Robert");

        Author as = new Author();
        as.setSurname("Szostak");
        as.setName("Adam");

        Book book1 = new Book();
        book1.setName("Pan Tadeusz");

        Book lalka = new Book();
        lalka.setName("Lalka");

        Book dwa = new Book();
        dwa.setName("Wilki dwa");

        book1.getAuthors().add(am);
        lalka.getAuthors().add(bp);
        dwa.getAuthors().add(rf);
        dwa.getAuthors().add(as);

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(am);
        session.save(bp);
        session.save(rf);
        session.save(as);
        session.save(book1);
        session.save(lalka);
        session.save(dwa);

        session.getTransaction().commit();

        sessionFactory.close();
    }
}
