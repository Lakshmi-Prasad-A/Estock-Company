package com.app.estock;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.estock.entity.Company;
import com.app.estock.entity.StockPrice;
import com.app.estock.repository.CompanyRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private CompanyRepository crepo;
	
//	@Autowired
//	private StockPriceRepository srepo;
	
	public void run(String... args) throws Exception {
		
		//StockPrice s1 = new StockPrice(1011, 30.0, new Date());
		
//		StockPrice s1 = new StockPrice(Integer.valueOf(1012), 30.87, new Date(),null);
//		StockPrice s2 = new StockPrice(Integer.valueOf(1013), 40.87, new Date(),null);
//		StockPrice s3 = new StockPrice(Integer.valueOf(1014), 50.88, new Date(),null);
//		StockPrice s4 = new StockPrice(Integer.valueOf(1015), 40.87, new Date(),null);
//		StockPrice s5 = new StockPrice(Integer.valueOf(1016), 40.87, new Date(),null);
//		StockPrice s6 = new StockPrice(Integer.valueOf(1017), 88.88, new Date(),null);
		
		Company c1 = new Company("785", "SidhuEnterprises", "Sidhu", 123.0, "nse",null);
		Company c2 = new Company("786", "NaguEnterprises", "NAGU", 124.0, "nse",null);
		
		
//		srepo.save(s1);
//		srepo.save(s2);
		
		crepo.save(c1);
				

	}

}
