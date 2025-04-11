package org.hibernate.curd.operation;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeByUpdate 
{
	public static void main(String[] args) 
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("Abhinav");
		e.setPhone(8844665599l);
		e.setDesg("HR");
		e.setSalary(30000);
		e.setGmail("Abhinav@gmail.com");
		e.setPassword("abhinav123");
		
		ses.update(e);
		tran.commit();
	}

}
