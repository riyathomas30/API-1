package com.OceanusFigma.OceanusFigma.DTO;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrawlingDataDTO {
	private String  trawlingNo;
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate trawlingDate;
	private double volume;
	private List<FishStorageDTO> fishDTO;
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
	public List<FishStorageDTO> getFishDTO() {
		return fishDTO;
	}
	public void setFishDTO(List<FishStorageDTO> fishDTO) {
		this.fishDTO = fishDTO;
	}
	
}
