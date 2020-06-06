package com.oneToOne;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Audi");
		
		Employee employee = new Employee();
		employee.setFirstName("Amit");
		employee.setLastName("Bansal");
		employee.setVehicle(vehicle);
		
		session.persist(employee);
		session.persist(vehicle);
		session.getTransaction().commit();
		session.close();
	}

}
