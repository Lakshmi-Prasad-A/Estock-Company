package com.app.estock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.exception.CompanyNotFound;
import com.app.estock.service.ServiceInter;

@RestController
@RequestMapping(value = "/api/v1.0/market/company")
public class Controller {

	@Autowired
	private ServiceInter ser;
	

	@RequestMapping( value = "/register",method = RequestMethod.POST)
	public Company saveCompany(@RequestBody Company company) {
		System.out.println("it is working fine"+ser);
		return ser.saveCompany(company);
		
	}
	@RequestMapping(value = "/register",method = RequestMethod.PUT)
	public Company updateCompany(@RequestBody Company company) {
		return ser.saveCompany(company);
	}
	
	@RequestMapping( value = "/getAll",method = RequestMethod.GET)
	public List<Company> getCompanies() {
		return ser.getAllCompanies();
	}
	
	@RequestMapping(value = "/info/{companyCode}", method = RequestMethod.GET)
	public Company findByComPanyId(@PathVariable String companyCode) throws CompanyNotFound {
		
		return ser.findByComPanyId(companyCode);
	}
	
	@RequestMapping( value = "/delete/{companyCode}",method = RequestMethod.DELETE)//path param
	public String deleteCompany(@PathVariable String companyCode) {
		ser.deleteByCompanyId(companyCode);
		return "Success";
	}
	}
