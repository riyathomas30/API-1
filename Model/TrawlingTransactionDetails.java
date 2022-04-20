package com.OceanusFigma.OceanusFigma.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class TrawlingTransactionDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String  trawlingNo;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate trawlingDate;
	private double volume;
	private String fishType;
	private String fishCategory;
	private String fishGrade;
	private int noOfBoxes;
	private String position;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrawlingNo() {
		return trawlingNo;
	}
	public void setTrawlingNo(String trawlingNo) {
		this.trawlingNo = trawlingNo;
	}
	public LocalDate getTrawlingDate() {
		return trawlingDate;
	}
	public void setTrawlingDate(LocalDate trawlingDate) {
		this.trawlingDate = trawlingDate;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public String getFishType() {
		return fishType;
	}
	public void setFishType(String fishType) {
		this.fishType = fishType;
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
	public int getNoOfBoxes() {
		return noOfBoxes;
	}
	public void setNoOfBoxes(int noOfBoxes) {
		this.noOfBoxes = noOfBoxes;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "TrawlingTransactionDetails [id=" + id + ", trawlingNo=" + trawlingNo + ", trawlingDate=" + trawlingDate
				+ ", volume=" + volume + ", fishType=" + fishType + ", fishCategory=" + fishCategory + ", fishGrade="
				+ fishGrade + ", noOfBoxes=" + noOfBoxes + ", position=" + position + "]";
	}
	

}
