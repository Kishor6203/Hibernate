package org.hibernate.curd.operation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCFG {
	
	public static void main(String[] args) 
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
	}

}
