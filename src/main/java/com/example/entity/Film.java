package com.example.entity;
// Generated 5 sept. 2021 ? 20:00:38 by Hibernate Tools 5.0.6.Final

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Film generated by hbm2java
 */
@Entity
@Table(name = "film", schema = "public")
public class Film implements java.io.Serializable {

	private int filmId;
	private Language language;
	private String title;
	private String description;
	private Serializable releaseYear;
	private short rentalDuration;
	private BigDecimal rentalRate;
	private Short length;
	private BigDecimal replacementCost;
	private String rating;
	private Date lastUpdate;
	private Serializable specialFeatures;
	private Serializable fulltext;
	private Set<Inventory> inventories = new HashSet<Inventory>(0);
	private Set<FilmCategory> filmCategories = new HashSet<FilmCategory>(0);
	private Set<FilmActor> filmActors = new HashSet<FilmActor>(0);

	public Film() {
	}

	public Film(int filmId, Language language, String title, short rentalDuration, BigDecimal rentalRate,
			BigDecimal replacementCost, Date lastUpdate, Serializable fulltext) {
		this.filmId = filmId;
		this.language = language;
		this.title = title;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
		this.lastUpdate = lastUpdate;
		this.fulltext = fulltext;
	}

	public Film(int filmId, Language language, String title, String description, Serializable releaseYear,
			short rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, String rating,
			Date lastUpdate, Serializable specialFeatures, Serializable fulltext, Set<Inventory> inventories,
			Set<FilmCategory> filmCategories, Set<FilmActor> filmActors) {
		this.filmId = filmId;
		this.language = language;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.lastUpdate = lastUpdate;
		this.specialFeatures = specialFeatures;
		this.fulltext = fulltext;
		this.inventories = inventories;
		this.filmCategories = filmCategories;
		this.filmActors = filmActors;
	}

	@Id

	@Column(name = "film_id", unique = true, nullable = false)
	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", nullable = false)
	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "release_year")
	public Serializable getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(Serializable releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Column(name = "rental_duration", nullable = false)
	public short getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	@Column(name = "rental_rate", nullable = false, precision = 4)
	public BigDecimal getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	@Column(name = "length")
	public Short getLength() {
		return this.length;
	}

	public void setLength(Short length) {
		this.length = length;
	}

	@Column(name = "replacement_cost", nullable = false, precision = 5)
	public BigDecimal getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	@Column(name = "rating")
	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 29)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Column(name = "special_features")
	public Serializable getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(Serializable specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	@Column(name = "fulltext", nullable = false)
	public Serializable getFulltext() {
		return this.fulltext;
	}

	public void setFulltext(Serializable fulltext) {
		this.fulltext = fulltext;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<FilmCategory> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
	public Set<FilmActor> getFilmActors() {
		return this.filmActors;
	}

	public void setFilmActors(Set<FilmActor> filmActors) {
		this.filmActors = filmActors;
	}

}
