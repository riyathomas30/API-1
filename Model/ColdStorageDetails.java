package com.OceanusFigma.OceanusFigma.Model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;  

@Entity
@Table(name="fishColdStorage_details")
public class ColdStorageDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private  String position;
	private String fishCategory;
	private String fishGrade;

	/*
	 * @OneToOne(cascade = { CascadeType.ALL })
	 * 
	 * @JoinColumn(referencedColumnName = "productid") private
	 * TrawlingTransactionDetails details;
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getFishCategory() {
		return fishCategory;
	}
	public void setFishCategory(String fishCategory) {
		this.fishCategory = fishCategory;
	}
	public String getFishGrade() {
		return fishGrade;
	}
	public void setFishGrade(String fishGrade) {
		this.fishGrade = fishGrade;
	}
	@Override
	public String toString() {
		return "ColdStorageDetails [id=" + id + ", position=" + position + ", fishCategory=" + fishCategory
				+ ", fishGrade=" + fishGrade + "]";
	}
}
