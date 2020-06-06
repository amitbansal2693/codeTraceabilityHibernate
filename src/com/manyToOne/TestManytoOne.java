package com.manyToOne;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Not working many to one.
 * Yet to test
 * @author Dell
 *
 */
public class TestManytoOne {

	public static void main(String[] args) {

		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Car");
		
		Employee employee = new Employee();
		employee.setFirstName("Amit");
		employee.setLastName("Bansal");

	//	employee1.getVehicle().add(vehicle1);
		vehicle.setEmployee(employee);
		vehicle1.setEmployee(employee);
		session.save(employee);
		session.save(vehicle);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
		
	}

}
