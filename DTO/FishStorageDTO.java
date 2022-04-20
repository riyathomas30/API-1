package com.OceanusFigma.OceanusFigma.DTO;

public class FishStorageDTO {

	private String fishType;
	private String fishCategory;
	private String fishGrade;
	private int noOfBoxes;
	private String position;
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
}
