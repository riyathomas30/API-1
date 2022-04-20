package com.OceanusFigma.OceanusFigma.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OceanusFigma.OceanusFigma.DTO.FishStorageDTO;
import com.OceanusFigma.OceanusFigma.DTO.TrawlingDataDTO;
import com.OceanusFigma.OceanusFigma.Model.ColdStorageDetails;
import com.OceanusFigma.OceanusFigma.Model.FishCategory;
import com.OceanusFigma.OceanusFigma.Model.FishGrade;
import com.OceanusFigma.OceanusFigma.Model.FishType;
import com.OceanusFigma.OceanusFigma.Model.TrawlingTransactionDetails;
import com.OceanusFigma.OceanusFigma.Repository.FishCategoryRepo;
import com.OceanusFigma.OceanusFigma.Repository.FishColdStorageRepo;
import com.OceanusFigma.OceanusFigma.Repository.FishGradeRepo;
import com.OceanusFigma.OceanusFigma.Repository.FishTypeRepo;
import com.OceanusFigma.OceanusFigma.Repository.TrawlingRepo;

@Service
public class TrawlingService {
	@Autowired
	TrawlingRepo trawlRepo;
	
	@Autowired
	FishTypeRepo fishTypeRepo;
	
	@Autowired
	FishCategoryRepo fishCategoryRepo;
	
	@Autowired
	FishGradeRepo fishGradeRepo;
	
	@Autowired
	FishColdStorageRepo coldStorageRepo;
	
	public List<TrawlingTransactionDetails> insertTransactionDetails(TrawlingDataDTO trawlingDto)
	{
	List<TrawlingTransactionDetails> trawlingDetails=new ArrayList<TrawlingTransactionDetails>();
	for(FishStorageDTO fishDTO:trawlingDto.getFishDTO())
	{
		TrawlingTransactionDetails trawlDetails=new  TrawlingTransactionDetails();
		trawlDetails.setTrawlingNo(trawlingDto.getTrawlingNo());
		trawlDetails.setTrawlingDate(trawlingDto.getTrawlingDate());
		trawlDetails.setVolume(trawlingDto.getVolume());
		trawlDetails.setFishType(fishDTO.getFishType());
		trawlDetails.setFishCategory(fishDTO.getFishCategory());
		trawlDetails.setFishGrade(fishDTO.getFishGrade());
		trawlDetails.setNoOfBoxes(fishDTO.getNoOfBoxes());
		trawlDetails.setPosition(fishDTO.getPosition());
		trawlingDetails.add(trawlDetails);  
		
		
	}
if(!trawlingDetails.isEmpty())
{
	trawlRepo.saveAll(trawlingDetails);
}
		
		return trawlingDetails;
		
	}
	public List<TrawlingTransactionDetails> getTrawlingDetails(String trawlingNo) {
		
		return trawlRepo.findByTrawlingNo(trawlingNo);
		 
	}
	public List<FishType> getFishType() {
		
		return fishTypeRepo.findAll();
	}
public List<FishType> getFishTypeEndsWith(String fishType) {
		
		return fishTypeRepo.findByfishTypeEndingWith(fishType);
	}	
		

	public List<FishCategory> getFishCategory(String fishType) {
		// TODO Auto-generated method stub
		return fishCategoryRepo.findByfishType(fishType);
	}
	
	public List<FishGrade> getFishGrade(String fishCategory) {
		// TODO Auto-generated method stub
		return fishGradeRepo.findByfishCategory(fishCategory);
	}
	
	
	/*
	 * public List<ColdStorageDetails> insertColdStorageDetails(TrawlingDataDTO
	 * trawlingDto) { List<ColdStorageDetails> storageDetails=new
	 * ArrayList<ColdStorageDetails>(); for(FishStorageDTO
	 * fishDTO:trawlingDto.getFishDTO()) { ColdStorageDetails storageDetail=new
	 * ColdStorageDetails(); storageDetail.setPosition(fishDTO.getPosition());
	 * storageDetail.setFishCategory(fishDTO.getFishCategory());
	 * storageDetail.setFishGrade(fishDTO.getFishGrade());
	 * 
	 * storageDetails.add(storageDetail);
	 * 
	 * 
	 * } return storageDetails;
	 * 
	 * }
	 */
 
}
