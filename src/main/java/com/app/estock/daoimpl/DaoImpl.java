package com.app.estock.daoimpl;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.estock.dao.DaoInter;
import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.CompanyNotFound;
import com.app.estock.repository.CompanyRepository;

@Repository
public class DaoImpl implements DaoInter {

	
	@Autowired
	public CompanyRepository comrepo;
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public Company saveCompany(Company company) {
		// TODO Auto-generated method stub
		//entityManager.persist(company);
		return comrepo.save(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		return comrepo.findAll();
	}

	@Override
	public Company findByComPanyId(String companyCode) throws CompanyNotFound {
		// TODO Auto-generated method stub	
		
		return comrepo.findById(companyCode).orElseThrow(()->new CompanyNotFound("Company is not found with code"+companyCode));
	}

	@Override
	public Company findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByCompanyId(String companyCode) {
		// TODO Auto-generated method stub
		
		
		comrepo.deleteById(companyCode);
	}

	@Override
	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		comrepo.save(company);
		
	}

	@Override
	public StockPrice findByStockId(Integer stockId) {
		// TODO Auto-generated method stub
		return comrepo.findByStockId(stockId);
	}

}
