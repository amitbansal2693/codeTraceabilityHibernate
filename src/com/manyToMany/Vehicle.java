package com.manyToMany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="CHILD_TABLE_M2M")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int vehicleId;
	@Column(name="VEHICLE_NAME")
	private String vehicleName;
	
	@ManyToMany(mappedBy="vehicle")
	private Collection<Employee> employee=new ArrayList<Employee>();

	public Collection<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Collection<Employee> employee) {
		this.employee = employee;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
