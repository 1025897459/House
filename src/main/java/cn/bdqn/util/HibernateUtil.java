package cn.bdqn.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory factory=null;
    static {
        Configuration configure = new Configuration().configure("hibernate.cfg.xml");
        factory = configure.buildSessionFactory();
    }
    public static Session openSession(){
        return factory.openSession();
    }
}
