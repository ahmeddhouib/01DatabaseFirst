package com.example.pojo;
// Generated 5 sept. 2021 ? 19:54:55 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Payment generated by hbm2java
 */
public class Payment implements java.io.Serializable {

	private int paymentId;
	private Customer customer;
	private Rental rental;
	private Staff staff;
	private BigDecimal amount;
	private Date paymentDate;

	public Payment() {
	}

	public Payment(int paymentId, Customer customer, Rental rental, Staff staff, BigDecimal amount, Date paymentDate) {
		this.paymentId = paymentId;
		this.customer = customer;
		this.rental = rental;
		this.staff = staff;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Rental getRental() {
		return this.rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
