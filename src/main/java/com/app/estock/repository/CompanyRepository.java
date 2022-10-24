package com.app.estock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;

public interface CompanyRepository extends JpaRepository<Company, String> {

	public StockPrice findByStockId(Integer stockId);

	

	
//	/public Company findByCompanyName(String companyName);
}
