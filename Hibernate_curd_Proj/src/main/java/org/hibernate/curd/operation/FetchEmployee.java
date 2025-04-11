package org.hibernate.curd.operation;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FetchEmployee 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sef=conf.buildSessionFactory();
		Session ses=sef.openSession();
		
		//Employee e=ses.get(Employee.class, id);
		
		//if(e!=null) {
		//	System.out.println(e);
		//}
		//else {
		//	System.err.println("Employee info not found since id is invalid");
		//}
		
		try {
			Employee e=ses.load(Employee.class, id);
			System.out.println(e.getName());
		}catch(ObjectNotFoundException e){
			System.err.println("Employee info not found since id is invalid");
		}
	}

}
