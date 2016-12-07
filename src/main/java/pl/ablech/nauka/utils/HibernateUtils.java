package pl.ablech.nauka.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Created by Arek on 07.12.2016.
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory(){
        try{
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .configure().build();
            return new Configuration().buildSessionFactory(serviceRegistry);
        }
        catch(Throwable ex){
            throw new ExceptionInInitializerError(ex);
        }

    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory ==null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
}
