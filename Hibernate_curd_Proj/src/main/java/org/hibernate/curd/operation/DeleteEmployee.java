package org.hibernate.curd.operation;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id to delete");
		int eid=sc.nextInt();
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=ses.get(Employee.class, eid);
		if(e!=null)
		{
			ses.delete(e);
			tran.commit();
		}
		else
		{
			System.err.println("Employee info is not deleted since id is invalid");
		}
		
	}

}
