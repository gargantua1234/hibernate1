package pl.ablech.nauka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.ablech.nauka.entities.Address;
import pl.ablech.nauka.entities.Person;
import pl.ablech.nauka.utils.HibernateUtils;

/**
 * Created by Arek on 15.12.2016.
 */
public class TestOneToOne {

    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("New York");
        address.setCountry("USA");
        address.setPostalCode("90123");

        Person person = new Person();
        person.setName("Gill");
        person.setSurname("Bates");
        person.setAddress(address);


        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        currentSession.beginTransaction();
        currentSession.save(person);
        currentSession.getTransaction().commit();

        sessionFactory.close();

    }
}
