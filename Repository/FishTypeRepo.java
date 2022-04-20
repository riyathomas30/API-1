package com.OceanusFigma.OceanusFigma.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OceanusFigma.OceanusFigma.Model.FishType;


public interface FishTypeRepo extends JpaRepository<FishType,Integer>  {
public	List<FishType> findByfishTypeEndingWith(String fishType);

}
