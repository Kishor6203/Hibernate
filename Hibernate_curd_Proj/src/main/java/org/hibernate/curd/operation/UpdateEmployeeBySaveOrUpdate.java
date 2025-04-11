package org.hibernate.curd.operation;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeBySaveOrUpdate 
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
		e.setId(10);
		e.setName("Anju");
		e.setPhone(446688992l);
		e.setDesg("TL");
		e.setGmail("Anju@gmail.com");
		e.setPassword("anju1234");
		e.setSalary(20000);
		
		ses.saveOrUpdate(e);
		tran.commit();
	}

}
