package com.quickcko.model;

import java.io.Serializable;

public class Currency implements Serializable{
	private static final long serialversionUID =1L;
	
	private Integer id;
	private String symbol;
	private String name;
	private String nameid;
	private Integer rank;
	private Double price_usd;
	private Double percent_change_24h;
	private Double percent_change_1h;
	private Double percent_change_7d;
	private Double price_btc;
	private Double market_cap_usd;
	private Double volume24;
	private Double volume24a;
	private Double csupply;
	private Double tsupply;
	private Double msupply;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameid() {
		return nameid;
	}
	public void setNameid(String nameid) {
		this.nameid = nameid;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public Double getPrice_usd() {
		return price_usd;
	}
	public void setPrice_usd(Double price_usd) {
		this.price_usd = price_usd;
	}
	public Double getPercent_change_24h() {
		return percent_change_24h;
	}
	public void setPercent_change_24h(Double percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}
	public Double getPercent_change_1h() {
		return percent_change_1h;
	}
	public void setPercent_change_1h(Double percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}
	public Double getPercent_change_7d() {
		return percent_change_7d;
	}
	public void setPercent_change_7d(Double percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}
	public Double getPrice_btc() {
		return price_btc;
	}
	public void setPrice_btc(Double price_btc) {
		this.price_btc = price_btc;
	}
	public Double getMarket_cap_usd() {
		return market_cap_usd;
	}
	public void setMarket_cap_usd(Double market_cap_usd) {
		this.market_cap_usd = market_cap_usd;
	}
	public Double getVolume24() {
		return volume24;
	}
	public void setVolume24(Double volume24) {
		this.volume24 = volume24;
	}
	public Double getVolume24a() {
		return volume24a;
	}
	public void setVolume24a(Double volume24a) {
		this.volume24a = volume24a;
	}
	public Double getCsupply() {
		return csupply;
	}
	public void setCsupply(Double csupply) {
		this.csupply = csupply;
	}
	public Double getTsupply() {
		return tsupply;
	}
	public void setTsupply(Double tsupply) {
		this.tsupply = tsupply;
	}
	public Double getMsupply() { 
		return msupply;
	}
	public void setMsupply(Double msupply) {
		this.msupply = msupply;
	}
	
}
