package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Company company = new Company(0,"Patanjali",null);
        GSTRegistration gstRegistration = new GSTRegistration(0,"LJP909090DG","composite",null);

        company.setGstInfo(gstRegistration);
        gstRegistration.setCompany(company);

        session.save(company);

        transaction.commit();

        Company company1 = session.get(Company.class,5);
        System.out.println(company1.getGstInfo());

    }
}
