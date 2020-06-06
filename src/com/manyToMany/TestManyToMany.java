package com.manyToMany;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

import com.manyToMany.*;

public class TestManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Car");

		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("Bus");
		
		Employee employee = new Employee();
		employee.setFirstName("Amit");
		employee.setLastName("Bansal");
		
		employee.getVehicle().add(vehicle);
		employee.getVehicle().add(vehicle1);
		
		vehicle.getEmployee().add(employee);
		vehicle1.getEmployee().add(employee);
		session.save(employee);
		session.save(vehicle);
		session.save(vehicle1);
		session.getTransaction().commit();
		session.close();
	}

}
