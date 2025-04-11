package org.hibernate.curd.operation;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class UpdateEmployeeByFetchAndUpdate 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee Id to update");
		int eid=sc.nextInt();
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
		tran.begin();
		
		Employee e=ses.get(Employee.class, eid); //Persistent State
		if(e!=null)
		{
			e.setName("ABC");
			e.setPhone(9911665983l);
			e.setDesg("TeamLeader");
			e.setSalary(40000);
			tran.commit();
		}
		else {
			System.err.println("Employee info not update since id is invalid");
		}
	}

}
