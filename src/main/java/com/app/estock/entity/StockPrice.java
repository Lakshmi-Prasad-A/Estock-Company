package com.app.estock.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name="stockPrice")

public class StockPrice {
//	@Id
//	@Column(name="stockId")
	private Integer stockId;
	
//	@Column(name="stockPrice")
	private Double stockPrice;
	
//	@Column(name="stockDate")
//	@Temporal(TemporalType.DATE)
	private Date stockDate;
	
//	@ManyToOne(fetch = FetchType.EAGER,cascade =CascadeType.ALL )
//	private Company company;
}
