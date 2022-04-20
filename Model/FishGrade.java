package com.OceanusFigma.OceanusFigma.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fish_grade_details")
public class FishGrade {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int  id;
private String fishCategory;
private String fishGrade;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getFishGrade() {
	return fishGrade;
}
public void setFishGrade(String fishGrade) {
	this.fishGrade = fishGrade;
}
public String getFishCategory() {
	return fishCategory;
}
public void setFishCategory(String fishCategory) {
	this.fishCategory = fishCategory;
}
@Override
public String toString() {
	return "FishGrade [id=" + id + ", fishCategory=" + fishCategory + ", fishGrade=" + fishGrade + "]";
}


}
