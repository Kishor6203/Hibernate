package org.hibernate.curd.operation;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=new Employee();
		e.setName("abc");
		e.setPhone(8899665588L);
		e.setDesg("Manager");
		e.setSalary(600000);
		e.setGmail("abc@gmail.com");
		e.setPassword("abc1234");
		
		int id=(int) ses.save(e);
		tran.commit();
		System.out.println("Employee details saved with id " +id);
	}

}
