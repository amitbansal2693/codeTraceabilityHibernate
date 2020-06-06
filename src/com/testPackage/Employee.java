package com.testPackage;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name = "USER_DETAILS	")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName, lastName;
	private Vehicle vehicle;
	
/*	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="vehicleId",column=@Column(name="Two_Wheereler_Id")),
		@AttributeOverride(name="vehicleName",column=@Column(name="Two_Wheereler_Name"))
		})
	private Vehicle twowheelerVehicle;

	public Vehicle getTwowheelerVehicle() {
		return twowheelerVehicle;
	}*/

	private Set<Vehicle> twowheelerVehicle=new HashSet();
	
	/*public void setTwowheelerVehicle(Vehicle twowheelerVehicle) {
		this.twowheelerVehicle = twowheelerVehicle;
	}*/

	public Set<Vehicle> getTwowheelerVehicle() {
		return twowheelerVehicle;
	}

	public void setTwowheelerVehicle(Set<Vehicle> twowheelerVehicle) {
		this.twowheelerVehicle = twowheelerVehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
