package org.home.util;

import java.io.File;
import javax.imageio.spi.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            
//            String hibernatePropsFilePath = "/etc/configs/hibernate.cfg.xml";
//            File hibernatePropsFile = new File(hibernatePropsFilePath);
//
//            Configuration configuration = new Configuration(); 
//            configuration.configure(hibernatePropsFile);
//
//            StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
////
//            ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
//
//            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            
            
            //"src/hibernate.cfg.xml"
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {

        // Alternatively, you could look up in JNDI here
        return sessionFactory;
    }

    public static void shutdown() {

        // Close caches and connection pools
        getSessionFactory().close();
    }

}
