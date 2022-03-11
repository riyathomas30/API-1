package com.OceanusFigma.OceanusFigma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OceanusFigma.OceanusFigma.Model.LoginUser;

@Repository
public interface LoginRepo extends JpaRepository<LoginUser,Integer> {

	LoginUser findByemailid(String emailid);
}
