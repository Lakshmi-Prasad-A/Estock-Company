package com.app.estock.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.estock.dao.DaoInter;
import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.CompanyNotFound;
import com.app.estock.service.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{
	
	@Autowired
	private DaoInter dao;
	
	@Autowired
	private RestTemplate restTemplate;

	@Value("${stock.api}")
	private String url;
	
	@Override
	public Company saveCompany(Company company) {
		// TODO Auto-generated method stub
		return dao.saveCompany(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		return dao.getAllCompanies();
	}

	@Override
	public Company findByComPanyId(String companyCode) throws CompanyNotFound {
		// TODO Auto-generated method stub
		System.err.println(url);
		  ResponseEntity<List> stockList = restTemplate.getForEntity(url+companyCode,
				  List.class);
		
		  System.err.println(stockList.getBody());
		  Company companyObj = dao.findByComPanyId(companyCode);
		  if(companyObj!=null&&!stockList.getBody().isEmpty())
		  {
			  companyObj.setStockList(stockList.getBody());
		  }
		return companyObj;
				
	}

	@Override
	public Company findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByCompanyId(String companyCode) {
		// TODO Auto-generated method stub
		dao.deleteByCompanyId(companyCode);
	}

	@Override
	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		dao.saveCompany(company);
	}
	
	@Override
	public StockPrice findByStockId(Integer stockId) {
		// TODO Auto-generated method stub
		return dao.findByStockId(stockId);
	}

}