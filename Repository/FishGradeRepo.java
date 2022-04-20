package com.OceanusFigma.OceanusFigma.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.OceanusFigma.OceanusFigma.Model.FishGrade;

public interface FishGradeRepo  extends JpaRepository<FishGrade,Integer> {
	public List<FishGrade> findByfishCategory(String fishCategory);
}
