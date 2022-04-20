package com.OceanusFigma.OceanusFigma.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OceanusFigma.OceanusFigma.Model.TrawlingTransactionDetails;

@Repository
public interface TrawlingRepo extends JpaRepository<TrawlingTransactionDetails,Integer>  {

	public List<TrawlingTransactionDetails> findByTrawlingNo(String trawlingNo);

}
