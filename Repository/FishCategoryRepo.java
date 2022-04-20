package com.OceanusFigma.OceanusFigma.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OceanusFigma.OceanusFigma.Model.FishCategory;


public interface FishCategoryRepo extends JpaRepository<FishCategory,Integer> {

	public List<FishCategory> findByfishType(String fishType);

}
