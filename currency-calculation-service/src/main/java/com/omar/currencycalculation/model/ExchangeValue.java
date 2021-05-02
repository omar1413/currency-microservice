package com.omar.currencycalculation.model;

import java.math.BigDecimal;

public class ExchangeValue {
	

	private long id;

	private String from;

	private String to;
	
	private BigDecimal convertionMultibel;
	

	private int port;

	
	public ExchangeValue() {}
	
	
	public ExchangeValue(int id, String form, String to, BigDecimal convertioMultibel) {
		super();
		this.id = id;
		this.from = form;
		this.to = to;
		this.convertionMultibel = convertioMultibel;
	}


	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFrom() {
		return from;
	}


	public void setFrom(String form) {
		this.from = form;
	}


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}


	public BigDecimal getConvertioMultibel() {
		return convertionMultibel;
	}


	public void setConvertioMultibel(BigDecimal convertioMultibel) {
		this.convertionMultibel = convertioMultibel;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
