package com.OceanusFigma.OceanusFigma.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OceanusFigma.OceanusFigma.DTO.TrawlingDataDTO;
import com.OceanusFigma.OceanusFigma.Model.ColdStorageDetails;
import com.OceanusFigma.OceanusFigma.Model.FishCategory;
import com.OceanusFigma.OceanusFigma.Model.FishGrade;
import com.OceanusFigma.OceanusFigma.Model.FishType;
import com.OceanusFigma.OceanusFigma.Model.TrawlingTransactionDetails;
import com.OceanusFigma.OceanusFigma.Service.TrawlingService;

@RestController
public class TrawlingController {

	@Autowired 
	TrawlingService trawlService;
	
	@PostMapping(value = "/insertData",consumes = "application/json")
	public List<TrawlingTransactionDetails> insertTransactionDetails(@RequestBody TrawlingDataDTO trawlingDto)
	{
		return trawlService.insertTransactionDetails(trawlingDto);
		 
	}
	@GetMapping(value="/getTrawlingDetails/{trawlingNo}")
	public List<TrawlingTransactionDetails> getTrawlingDetails(@PathVariable String trawlingNo)
	{
		return  trawlService.getTrawlingDetails(trawlingNo);
	}
	
	@GetMapping(value="/getFishType")
	public List<FishType> getFishType()
	{
		return  trawlService.getFishType();
	}
	@GetMapping(value="/getFishTypeEnd/{fishType}")
	public List<FishType> getFishTypeEndsWith(@PathVariable String fishType)
	{
		return  trawlService.getFishTypeEndsWith(fishType);
	}
	@GetMapping(value="/getFishCategory/{fishType}")
	public List<FishCategory> getFishCategory(@PathVariable String fishType)
	{
		return  trawlService.getFishCategory(fishType);
	}
	@GetMapping(value="/getFishGrade/{fishCategory}")
	public List<FishGrade> getFishGrade(@PathVariable String fishCategory)
	{
		return  trawlService.getFishGrade(fishCategory);
	}
	
	/*
	 * @PostMapping(value = "/insertData",consumes = "application/json") public
	 * List<ColdStorageDetails> insertColdStorageDetails(@RequestBody
	 * TrawlingDataDTO trawlingDto) { return
	 * trawlService.insertColdStorageDetails(trawlingDto);
	 * 
	 * }
	 */

}
