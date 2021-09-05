package com.example.entity;
// Generated 5 sept. 2021 � 20:00:38 by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SalesByFilmCategoryId generated by hbm2java
 */
@Embeddable
public class SalesByFilmCategoryId implements java.io.Serializable {

	private String category;
	private Byte totalSales;

	public SalesByFilmCategoryId() {
	}

	public SalesByFilmCategoryId(String category, Byte totalSales) {
		this.category = category;
		this.totalSales = totalSales;
	}

	@Column(name = "category", length = 25)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "total_sales", precision = 0, scale = 0)
	public Byte getTotalSales() {
		return this.totalSales;
	}

	public void setTotalSales(Byte totalSales) {
		this.totalSales = totalSales;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SalesByFilmCategoryId))
			return false;
		SalesByFilmCategoryId castOther = (SalesByFilmCategoryId) other;

		return ((this.getCategory() == castOther.getCategory()) || (this.getCategory() != null
				&& castOther.getCategory() != null && this.getCategory().equals(castOther.getCategory())))
				&& ((this.getTotalSales() == castOther.getTotalSales())
						|| (this.getTotalSales() != null && castOther.getTotalSales() != null
								&& this.getTotalSales().equals(castOther.getTotalSales())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCategory() == null ? 0 : this.getCategory().hashCode());
		result = 37 * result + (getTotalSales() == null ? 0 : this.getTotalSales().hashCode());
		return result;
	}

}