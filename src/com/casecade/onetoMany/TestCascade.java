package com.casecade.onetoMany;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 * Here we are using cascading
 * @author Dell
 *
 */
public class TestCascade {
public static void main(String... args){

	Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	session.beginTransaction();
	
	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleName("Car");
	Vehicle vehicle1 = new Vehicle();
	vehicle1.setVehicleName("AirBus");

	Employee employee = new Employee();
	employee.setFirstName("one to Many");
	employee.setLastName("Amit");
	employee.getVehicle().add(vehicle);
	employee.getVehicle().add(vehicle1);
	
	//persist data when cascading is used
	session.persist(employee);
	session.getTransaction().commit();
	session.close();
	
}
}
