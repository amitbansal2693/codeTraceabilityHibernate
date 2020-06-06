package com.inheritance;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		session.beginTransaction();

		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Kinetic");
		
		TwoWheeler two=new TwoWheeler();
		two.setVehicleName("Eterno");
		two.setSteeringHandle("2 Wheeler steering");
		
		FourWheeler four=new FourWheeler();
		four.setVehicleName("Lamborgini");
		four.setSteeringWheel("4 wheeler steering");
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
		
	}

}
