package com.example.pojo;
// Generated 5 sept. 2021 ? 19:54:55 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private int customerId;
	private Address address;
	private short storeId;
	private String firstName;
	private String lastName;
	private String email;
	private boolean activebool;
	private Date createDate;
	private Date lastUpdate;
	private Integer active;
	private Set rentals = new HashSet(0);
	private Set payments = new HashSet(0);

	public Customer() {
	}

	public Customer(int customerId, Address address, short storeId, String firstName, String lastName,
			boolean activebool, Date createDate) {
		this.customerId = customerId;
		this.address = address;
		this.storeId = storeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.activebool = activebool;
		this.createDate = createDate;
	}

	public Customer(int customerId, Address address, short storeId, String firstName, String lastName, String email,
			boolean activebool, Date createDate, Date lastUpdate, Integer active, Set rentals, Set payments) {
		this.customerId = customerId;
		this.address = address;
		this.storeId = storeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.activebool = activebool;
		this.createDate = createDate;
		this.lastUpdate = lastUpdate;
		this.active = active;
		this.rentals = rentals;
		this.payments = payments;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public short getStoreId() {
		return this.storeId;
	}

	public void setStoreId(short storeId) {
		this.storeId = storeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActivebool() {
		return this.activebool;
	}

	public void setActivebool(boolean activebool) {
		this.activebool = activebool;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Set getRentals() {
		return this.rentals;
	}

	public void setRentals(Set rentals) {
		this.rentals = rentals;
	}

	public Set getPayments() {
		return this.payments;
	}

	public void setPayments(Set payments) {
		this.payments = payments;
	}

}
