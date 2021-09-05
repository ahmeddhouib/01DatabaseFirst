package com.example.pojo;
// Generated 5 sept. 2021 � 19:54:55 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Language generated by hbm2java
 */
public class Language implements java.io.Serializable {

	private int languageId;
	private String name;
	private Date lastUpdate;
	private Set films = new HashSet(0);

	public Language() {
	}

	public Language(int languageId, String name, Date lastUpdate) {
		this.languageId = languageId;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	public Language(int languageId, String name, Date lastUpdate, Set films) {
		this.languageId = languageId;
		this.name = name;
		this.lastUpdate = lastUpdate;
		this.films = films;
	}

	public int getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getFilms() {
		return this.films;
	}

	public void setFilms(Set films) {
		this.films = films;
	}

}