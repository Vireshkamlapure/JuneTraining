package com.bookstore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Alien alien1 = new Alien();
        alien1.setAlienId(104);
        alien1.setAlienName("Steve");
        alien1.setAlienTech("Sheild");

//        Configuration configuration =new Configuration();
//        configuration.addAnnotatedClass(com.bookstore.Alien.class);
//        configuration.configure();

        SessionFactory sessionFactory = new Configuration()
                                        .addAnnotatedClass(com.bookstore.Alien.class)
                                        .configure()
                                        .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        //Storing Data
        session.persist(alien1);

        // Update Data
//        session.merge(alien1);

        //Delete Data
//        Alien alien3 = session.find(Alien.class , 104);
//        session.remove(alien3);

        //Fetching Data
//        Alien alien2 = session.find(Alien.class , 103);
//        System.out.println(alien2);

        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}