package com.app.estock.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="company")
public class Company {

	@Id
	@Column(name="companyCode", unique = true)
	private String companyCode;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="companyCeo")
	private String companyCeo;
	
	
//	Turnover must be >........................
	@Column(name="companyTurnover")
	
	private Double companyTurnover;
	
	@Column(name="companyStockExchange", nullable = false)
	private String companyStockExchange;
	
//	@OneToMany(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
//	@JoinColumn(name="companyCode")
	@Transient
	private List<StockPrice> stockList;
	
	

}
