package com.oneToMany;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

import com.oneToMany.Employee;
import com.oneToMany.Vehicle;
/**
 * one to Many Example
 * @author Dell
 *
 */
public class Test {
	public static final void main(String... args){
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
	
	//persis data
	session.save(employee);

	session.save(vehicle);
	session.save(vehicle1);
	session.getTransaction().commit();
	session.close();
	}
}
