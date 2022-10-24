package com.app.estock.service;

import java.util.List;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.CompanyNotFound;


public interface ServiceInter {
	
	public Company saveCompany(Company company);
	
	public List<Company> getAllCompanies();
	
	public Company findByComPanyId(String companyCode) throws CompanyNotFound;
	
	public Company findByName();
	
	public void deleteByCompanyId(String CompanyCode);
	
	public void updateCompany(Company company);

	public StockPrice findByStockId(Integer stockId);
	
}
