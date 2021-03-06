package com.example.pojo;
// Generated 5 sept. 2021 ? 19:54:55 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */
public class Country implements java.io.Serializable {

	private int countryId;
	private String country;
	private Date lastUpdate;
	private Set cities = new HashSet(0);

	public Country() {
	}

	public Country(int countryId, String country, Date lastUpdate) {
		this.countryId = countryId;
		this.country = country;
		this.lastUpdate = lastUpdate;
	}

	public Country(int countryId, String country, Date lastUpdate, Set cities) {
		this.countryId = countryId;
		this.country = country;
		this.lastUpdate = lastUpdate;
		this.cities = cities;
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

}
