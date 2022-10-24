package com.app.estock.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.CompanyNotFound;


public interface DaoInter {
	
	public Company saveCompany(Company company);
	
	public List<Company> getAllCompanies();
	
	public Company findByComPanyId(String companyCode) throws CompanyNotFound;
	
	public Company findByName();
	
	public void deleteByCompanyId(String companyCode);
	
	public void updateCompany(Company company);

	public StockPrice findByStockId(Integer stockId);

}
