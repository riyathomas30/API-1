package com.OceanusFigma.OceanusFigma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OceanusFigma.OceanusFigma.Model.ColdStorageDetails;


public interface FishColdStorageRepo extends JpaRepository<ColdStorageDetails,Integer> {
	

}
