package com.bookstore.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatesUtil {
    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().addAnnotatedClass(com.bookstore.model.Book.class).configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
