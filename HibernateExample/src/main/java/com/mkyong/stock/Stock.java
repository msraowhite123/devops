package com.mkyong.stock;

import static javax.persistence.GenerationType.IDENTITY;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock implements java.io.Serializable {

	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<StockDetail> stockDetail=new HashSet<StockDetail>();

	public Stock() {
	}

	public Stock(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	/*public Stock(String stockCode, String stockName, StockDetail stockDetail) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetail = stockDetail;
	}*/

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "SID",  unique = true, nullable = false)
	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	

	/*@OneToOne(fetch = FetchType.LAZY ,cascade = CascadeType.ALL)
	@JoinColumn(name="stockdetailsId")*/
	@OneToMany(mappedBy="stock")
	//@JoinTable(name="Stock_details",joinColumns=@JoinColumn(name="STOCK_ID"),
	//inverseJoinColumns=@JoinColumn(name="STOCKDETAILS_ID"))
	public Set<StockDetail> getStockDetail() {
		return stockDetail;
	}

	public void setStockDetail(Set<StockDetail> stockDetail) {
		this.stockDetail = stockDetail;
	}
	/*public StockDetail getStockDetail() {
		return this.stockDetail;
	}

	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}*/

}
