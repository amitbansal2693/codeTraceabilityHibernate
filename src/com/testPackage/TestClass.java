package com.testPackage;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.*;

public class TestClass {
	public static void main(String[] args) {
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		try {
			Transaction t = session.beginTransaction();
Vehicle vehicle=new Vehicle();
vehicle.setVehicleName("Audi");
Vehicle vehicle1=new Vehicle();
vehicle1.setVehicleName("r15");

			Employee e1 = new Employee();
			// e1.setId(1001);
			e1.setFirstName("Amit");
			e1.setLastName("Bansal");
			//e1.setVehicle(vehicle);
			e1.getTwowheelerVehicle().add(vehicle);
			e1.getTwowheelerVehicle().add(vehicle1);
			Employee e2 = new Employee();
			// e2.setId(1002);
			e2.setFirstName("Sumit");
			e2.setLastName("Garg");
			e2.setVehicle(vehicle);
			Employee e3 = new Employee();
			e3.setFirstName("Mohit");
			e3.setLastName("Garg");
			e3.setVehicle(vehicle1);


 session.persist(e1); 
 //session.persist(e2); 
 //session.persist(e3);
			 

/*			List<String> resultList = session.createCriteria(Employee.class)
					.setProjection(Projections.property("firstName")).addOrder(Order.desc("firstName")).
					add(Restrictions.ne("firstName", "")).list();
			System.out.println("List is: " + resultList.get(1));

			for (int i = 0; i < resultList.size(); i++) {
				System.out.println(resultList.get(i));
			}
*/
			t.commit();

			System.out.println("successfully saved");
		} finally {
			session.close();
		}
	}
}
