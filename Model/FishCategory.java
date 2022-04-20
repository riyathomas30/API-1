package com.OceanusFigma.OceanusFigma.Model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table(name="fish_category_details")
public class FishCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	private String fishType;
	private String fishCategory;
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "id") private FishType id;
	 */
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFishCategory() {
		return fishCategory;
	}
	public void setFishCategory(String fishCategory) {
		this.fishCategory = fishCategory;
	}
	public String getFishType() {
		return fishType;
	}
	public void setFishType(String fishType) {
		this.fishType = fishType;
	}
	@Override
	public String toString() {
		return "FishCategory [id=" + id + ", fishType=" + fishType + ", fishCategory=" + fishCategory + "]";
	}
	

}
