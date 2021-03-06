package com.example.entity;
// Generated 5 sept. 2021 ? 20:00:38 by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CustomerListId generated by hbm2java
 */
@Embeddable
public class CustomerListId implements java.io.Serializable {

	private Integer id;
	private String name;
	private String address;
	private String zipCode;
	private String phone;
	private String city;
	private String country;
	private String notes;
	private Short sid;

	public CustomerListId() {
	}

	public CustomerListId(Integer id, String name, String address, String zipCode, String phone, String city,
			String country, String notes, Short sid) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.zipCode = zipCode;
		this.phone = phone;
		this.city = city;
		this.country = country;
		this.notes = notes;
		this.sid = sid;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 50)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "zip code", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "city", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "country", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "sid")
	public Short getSid() {
		return this.sid;
	}

	public void setSid(Short sid) {
		this.sid = sid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CustomerListId))
			return false;
		CustomerListId castOther = (CustomerListId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& ((this.getAddress() == castOther.getAddress()) || (this.getAddress() != null
						&& castOther.getAddress() != null && this.getAddress().equals(castOther.getAddress())))
				&& ((this.getZipCode() == castOther.getZipCode()) || (this.getZipCode() != null
						&& castOther.getZipCode() != null && this.getZipCode().equals(castOther.getZipCode())))
				&& ((this.getPhone() == castOther.getPhone()) || (this.getPhone() != null
						&& castOther.getPhone() != null && this.getPhone().equals(castOther.getPhone())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
						&& this.getCity().equals(castOther.getCity())))
				&& ((this.getCountry() == castOther.getCountry()) || (this.getCountry() != null
						&& castOther.getCountry() != null && this.getCountry().equals(castOther.getCountry())))
				&& ((this.getNotes() == castOther.getNotes()) || (this.getNotes() != null
						&& castOther.getNotes() != null && this.getNotes().equals(castOther.getNotes())))
				&& ((this.getSid() == castOther.getSid()) || (this.getSid() != null && castOther.getSid() != null
						&& this.getSid().equals(castOther.getSid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result + (getZipCode() == null ? 0 : this.getZipCode().hashCode());
		result = 37 * result + (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getCountry() == null ? 0 : this.getCountry().hashCode());
		result = 37 * result + (getNotes() == null ? 0 : this.getNotes().hashCode());
		result = 37 * result + (getSid() == null ? 0 : this.getSid().hashCode());
		return result;
	}

}
